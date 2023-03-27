package dio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import dio.model.Usuario;
import dio.repository.UsuarioRepository;

@RestController
@RequestMapping("/users")
public class UsuarioController {
  @Autowired
  private UsuarioRepository repository;
  @GetMapping
  public List<Usuario> list(){
    return repository.findAll();
  }
  @PostMapping
  public void save(@RequestBody Usuario usuario){
    repository.save(new Usuario());
  }
  @PutMapping
  public void update(@RequestBody Usuario usuario){
    repository.save(usuario);
  }
  @GetMapping("/{username}")
  public Usuario find(@PathVariable("/username") String username){
    return repository.findByUsername(username);
  }
  @DeleteMapping("/{id}")
  public void delete(@PathVariable("/id") Integer id){
    repository.deleteById(id);
  }
}
