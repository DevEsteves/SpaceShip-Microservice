package example.micronaut.space;

import io.micronaut.http.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class SpaceShipRestController {
    private static List<SpaceShip> ships = new ArrayList(List.of(new SpaceShip( "Mike", 60 )));

    @Get("/ship")
    public List<SpaceShip> ships(){
        return ships;
    }

    @Post("/ship")
    public List<SpaceShip> ships(@Body SpaceShip ship){
        ships.add(ship);
        return ships;
    }

    @Delete("/ship/{captain}")
    public List<SpaceShip> deleteships(@PathVariable String captain){
        List<SpaceShip> collect = ships.stream().filter((s) -> s.getCaptain().equalsIgnoreCase(captain))
            .collect(Collectors.toList());
        ships.removeAll(collect);
        return ships;
    } 
}