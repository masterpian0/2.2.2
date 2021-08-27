package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarImpDao implements CarDAO {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("LADA_2107", "RED", 1992));
        carList.add(new Car("OKA_1111", "WHITE", 1997));
        carList.add(new Car("LADA_VESTA", "GRAY", 2018));
        carList.add(new Car("NIVA_2121", "GREEN", 2005));
        carList.add(new Car("UAZ_PATRIOT", "GREEN", 2011));
    }

    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
