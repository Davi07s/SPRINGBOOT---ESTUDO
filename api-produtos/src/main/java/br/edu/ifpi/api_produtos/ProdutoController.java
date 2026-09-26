package br.edu.ifpi.api_produtos;

import java.util.List;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    // GET /ola
    @GetMapping("/ola")
    public String ola() {
        return "produto api";
    }

    // GET /produtos
    @GetMapping("/produtos")
    public List<Produto> listar() {
        return List.of(
                new Produto(1L, "Mouse", "Informatica", 82.00)
        );
    }

    // GET /produtos/{id}
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

    // POST /produtos
    @PostMapping("/produtos")
    public ResponseEntity<ProdutoDTO> criar(
            @Valid @RequestBody ProdutoDTO dto) {

        ProdutoDTO criado = produtoService.salvar(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(criado);
    }
}