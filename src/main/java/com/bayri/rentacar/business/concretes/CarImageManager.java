package com.bayri.rentacar.business.concretes;

import com.bayri.rentacar.business.abstracts.CarImageService;
import com.bayri.rentacar.core.adapters.Cloudinary.CloudinaryService;
import com.bayri.rentacar.core.utilities.results.DataResult;
import com.bayri.rentacar.core.utilities.results.ErrorDataResult;
import com.bayri.rentacar.core.utilities.results.Result;
import com.bayri.rentacar.core.utilities.results.SuccessDataResult;
import com.bayri.rentacar.dataAccess.abstracts.CarDao;
import com.bayri.rentacar.dataAccess.abstracts.CarImageDao;
import com.bayri.rentacar.entities.concretes.Car;
import com.bayri.rentacar.entities.concretes.CarImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class CarImageManager implements CarImageService {

    private final CarImageDao carImageDao;
    private final CarDao carDao;
    private final CloudinaryService cloudinaryService;

    @Autowired
    public CarImageManager(CarImageDao carImageDao, CarDao carDao, CloudinaryService cloudinaryService) {
        super();
        this.carImageDao = carImageDao;
        this.carDao = carDao;
        this.cloudinaryService = cloudinaryService;
    }

    @Override
    public Result add(int carId,CarImage carImage) {
        Car car = this.carDao.getById(carId);
        carImage.setCar(car);
        if (this.carImageDao.save(carImage) != null){
            return new SuccessDataResult<>();
        }
        return new ErrorDataResult<>();
    }

    @Override
    public DataResult<CarImage> upload(int carId,MultipartFile image) {
        DataResult<Map<String, String>> result = this.cloudinaryService.upload(image);

        if(result.isSuccess()) {
            Car car = this.carDao.getById(carId);
            CarImage carImage= new CarImage();
            carImage.setUrl(result.getData().get("url"));
            Result addingResult = this.add(car.getId(),carImage);
            if (addingResult.isSuccess()) {
                return new SuccessDataResult<CarImage>(carImage);
            }
        }
        return new ErrorDataResult<CarImage>(null,"Dosya yüklenemedi");
    }

    @Override
    public CarImage getByCar_Id(int id) {
        return this.carImageDao.getByCar_Id(id);
    }

    @Override
    public DataResult<List<CarImage>> getAll() {
        return new SuccessDataResult<>(this.carImageDao.findAll());
    }

}
