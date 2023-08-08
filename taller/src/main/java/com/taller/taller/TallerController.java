package com.taller.taller;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/")
public class TallerController {

    TallerService service = new TallerService();

    @PostMapping("/leer-data")
    //En este caso se debe hacer así ya que al enviarlo en este caso específico ya que a diferencia de el ejemplo
    //Pasado este no tiene forma de encontrar el KeyValue automaticamente como si el RequestBody fuese un objeto
    //(Por ejemplo) public Optional<Persona> ponerPersona(@RequestBody() Persona persona)
    //Por esto mismo debemos hacer el Map aquí, ya que al hacer la petición se envía como key
    //Route y se recibe como value el URL (La petición es esta: "route": "C:/Users/jupag/Desktop/taller/people.csv").

    public String sendFileURL(@RequestBody Map<String, String> body) throws IOException {
        String route = body.get("route");
        return this.service.identifyDocument(route);
    }


}
