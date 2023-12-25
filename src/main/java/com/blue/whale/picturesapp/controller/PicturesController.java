package com.blue.whale.picturesapp.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class PicturesController {

	@GetMapping(value = "/giraffe", produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] getImage() throws IOException {
		InputStream in = getClass().getResourceAsStream(
				"/giraffes/" + ThreadLocalRandom.current().nextInt(0, 6) + ".jpg");
		return IOUtils.toByteArray(in);
	}
}
