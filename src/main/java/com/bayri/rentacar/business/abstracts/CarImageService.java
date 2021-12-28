package com.bayri.rentacar.business.abstracts;

import com.bayri.rentacar.core.utilities.results.DataResult;
import com.bayri.rentacar.core.utilities.results.Result;
import com.bayri.rentacar.entities.concretes.CarImage;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CarImageService {
    Result add(int carId,CarImage carImage);
    DataResult<CarImage> upload(int carId,MultipartFile image);
    CarImage getByCar_Id(int id);
    DataResult<List<CarImage>> getAll();
}
