package br.edu.ifpi.api_produtos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity; // METODO DE UM CONTROLLER QUE RETORNA O OBJETO COM O STATUS ESPECIFICO E UM CORPO
import org.springframework.web.bind.annotation.*;

@RestController
public class ProdutoController {

    // Lista que funcionará como um "banco de dados" temporário
    private final List<Produto> produtos = new ArrayList<>();

    // GET /ola
    @GetMapping("/ola")
    public String ola() {
        return "produto api";
    }

    // GET /produtos
    @GetMapping("/produtos")
    public List<Produto> listar() {
        return produtos;
    }

    // GET /produtos/{id}
    @GetMapping("/produtos/{id}")
    public ResponseEntity<Produto> buscar(@PathVariable Long id) {

        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                return ResponseEntity.ok(produto);
            }
        }

        return ResponseEntity.notFound().build();
    }

    // POST /produtos
    @PostMapping("/produtos")
    public ResponseEntity<Produto> criar(@RequestBody Produto produto) {

        produtos.add(produto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(produto);
    }

    // POST /produtos/lote
    // PERMITE CRIAR NOVOS DADOS EM LOTES UTILIZANDO LIST
    @PostMapping("/produtos/lote")
    public ResponseEntity<List<Produto>> criarVarios(
            @RequestBody List<Produto> novosProdutos) {

        produtos.addAll(novosProdutos);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(novosProdutos);
    }

    // PUT /produtos/{id}
    @PutMapping("/produtos/{id}")
    public ResponseEntity<Produto> atualizar(
            @PathVariable Long id,
            @RequestBody Produto produtoAtualizado) {

        for (int i = 0; i < produtos.size(); i++) {

            if (produtos.get(i).getId().equals(id)) {

                produtoAtualizado.setId(id);
                produtos.set(i, produtoAtualizado);

                return ResponseEntity.ok(produtoAtualizado);
            }
        }

        return ResponseEntity.notFound().build();
    }

    // DELETE /produtos/{id}
    @DeleteMapping("/produtos/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {

        for (Produto produto : produtos) {

            if (produto.getId().equals(id)) {
                produtos.remove(produto);
                return ResponseEntity.noContent().build();
            }
        }

        return ResponseEntity.notFound().build();
    }
}


/*
// GET /produtos
@GetMapping("/produtos")
public List<Produto> listar() {
    return List.of(
            new Produto(1L, "Mouse", "Informatica", 82.00)
    );
}
 */

// GET /produtos/{id}
/*
@GetMapping("/produtos/{id}")
public ResponseEntity<Produto> buscar(@PathVariable("id") Long id) {

    Produto produto = new Produto(
            id,
            "Produto" + id,
            "Informatica",
            82.00 + id
    );

    return ResponseEntity.ok(produto);
}
*/
