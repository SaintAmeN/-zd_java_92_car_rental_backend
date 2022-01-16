package com.sda.j92.carrentalbackend.controller;

import com.sda.j92.carrentalbackend.model.ApplicationUser;
import com.sda.j92.carrentalbackend.model.CarRentalOffer;
import com.sda.j92.carrentalbackend.service.ApplicationUserService;
import com.sda.j92.carrentalbackend.service.CarRentalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/offers")
@RequiredArgsConstructor
public class CarRentalController {
    private final CarRentalService carRentalService;
    private final ApplicationUserService applicationUserService;

    @GetMapping("")
    public List<CarRentalOffer> get(Principal principal){
        Optional<Long> userIdOptional = applicationUserService.getLoggedInUserId(principal);
        log.info("Zalogowani? : " + userIdOptional);
        return carRentalService.findAll();
    }

    @PostMapping("")
    public void add(@RequestBody  CarRentalOffer offer){
        carRentalService.add(offer);
    }

    @DeleteMapping("/{id}")
    public void add(@PathVariable Long id){
        carRentalService.delete(id);
    }

}
