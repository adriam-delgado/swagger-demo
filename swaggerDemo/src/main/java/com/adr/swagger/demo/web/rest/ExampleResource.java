package com.adr.swagger.demo.web.rest;

import com.adr.swagger.demo.web.rest.dto.ExampleDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ExampleResource {



    @ApiOperation(value = "Acá nombramos la operación"
            , notes = "Podemos incluir una descripción mas detallada que será util al cliente")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = ExampleDTO.class),
            @ApiResponse(code = 400, message = "Bad Request.Esta vez cambiamos el tipo de dato de la respuesta (String)", response = String.class),
            @ApiResponse(code = 500, message = "Error inesperado del sistema")})
    @GetMapping("/examples")
    public ResponseEntity<Object> getExample1() {
        ExampleDTO exampleDTO = new ExampleDTO();
        exampleDTO.setFirstAttribute("the first");
        exampleDTO.setLongAtribute(3L);
        return ResponseEntity.ok(exampleDTO);
    }



}
