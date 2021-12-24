package com.est.seminario.web;


import com.est.seminario.models.response.PersonInfoOutput;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/person")
public class PersonController {

    /*@Autowired
    private ExampleService exampleService;
*/
    @GetMapping(value = "/{personId}")
    public ResponseEntity<PersonInfoOutput> getParticipantsByContractId(@PathVariable(value = "personId") String id) {
        return ResponseEntity.ok(PersonInfoOutput.builder()
                        .id(Integer.parseInt(id))
                        .name("Mauro Almeida")
                        .email("teste@gmail.com")
                .build());
    }

}
