package com.datmt.jpa2;

import com.datmt.jpa2.entity.Phone;
import com.datmt.jpa2.entity.SmartPhone;
import com.datmt.jpa2.repository.PhoneRepository;
import com.datmt.jpa2.repository.SmartPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jpa2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Jpa2Application.class, args);
    }

    @Autowired
    PhoneRepository phoneRepository;

    @Autowired
    SmartPhoneRepository smartPhoneRepository;

    @Override
    public void run(String... args) throws Exception {
        Phone simplePhone = new Phone();
        simplePhone.setModel("NOKIA N8");
        simplePhone.setScreenSize(3.2f);
        simplePhone.setWeight(0.1f);
        simplePhone.setPrice(35.0f);


        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setModel("iPhone 12");
        smartPhone.setPrice(999f);
        smartPhone.setScreenSize(5.7f);
        smartPhone.setWeight(0.5f);
        smartPhone.setCpuCoresCount(8);
        smartPhone.setFrontCameraResolution(20.1f);
        smartPhone.setRearCameraResolution(40.1f);
        smartPhone.setHasSDCard(false);
        smartPhone.setHasFingerprintUnlock(false);

        smartPhone.setBrainCount(100f);


        phoneRepository.save(simplePhone);
        smartPhoneRepository.save(smartPhone);
    }
}
