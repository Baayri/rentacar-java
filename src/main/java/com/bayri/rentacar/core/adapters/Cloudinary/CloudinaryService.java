package com.bayri.rentacar.core.adapters.Cloudinary;

import com.bayri.rentacar.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface CloudinaryService {
    DataResult<Map<String,String>> upload(MultipartFile multipartFile);
}
