package develhope.eserciziocontrollerGETPOST.esercizioControllerGetPost.controllers;

import develhope.eserciziocontrollerGETPOST.esercizioControllerGetPost.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @Autowired
    private NameService nameService;

    @GetMapping("/getName")
    public ResponseEntity<String> getName(@RequestParam String name){
        return ResponseEntity.ok().body(name);
    }

    @PostMapping("/reverse")
    public ResponseEntity<StringBuilder> reverseName(@RequestParam String name){
        StringBuilder reversedName = nameService.reverseName(name);
        return ResponseEntity.ok().body(reversedName);
    }

}
