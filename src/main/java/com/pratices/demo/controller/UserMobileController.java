package com.pratices.demo.controller;

import java.io.IOException;
import java.net.http.HttpHeaders;
import java.util.Optional;
import org.springframework.http.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.zxing.WriterException;
import com.pratices.demo.modle.UserMobileDetailes;
import com.pratices.demo.services.UserMobileService;

@RestController
public class UserMobileController {
	@Autowired
	UserMobileService userMobileService;
	
	@PostMapping("/mobileusersave")
	public ResponseEntity<UserMobileDetailes> saveUser(@RequestBody UserMobileDetailes userMobileDetailes) throws WriterException, IOException{
		UserMobileDetailes savedUser = userMobileService.saveUserWithQRCode(userMobileDetailes);
	    int p=20;
	    System.out.print(p);
		return ResponseEntity.ok(userMobileDetailes);
		
	}
	 /*@GetMapping("/qr/{id}")
	    public ResponseEntity<byte[]> getQRCode(@PathVariable Long id) {
	        Optional<UserMobileDetailes> user = userMobileService.getUserById(id);

	        if (user.isPresent() && user.get().getQrCode() != null) {
	            return ResponseEntity.ok()
	                    .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=qr.png")
	                    .contentType(MediaType.IMAGE_PNG)
	                    .body(user.get().getQrCode());
	        }
	        return ResponseEntity.notFound().build();
	    }*/

}
