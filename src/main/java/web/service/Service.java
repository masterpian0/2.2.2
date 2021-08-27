package web.service;

import web.dao.CarImpDao;
import web.model.Car;

import java.util.List;

public class Service {

    private CarImpDao carImpDao = new CarImpDao();

    public List<Car> getCars(int count) {
        return carImpDao.getCars(count);
    }
}
