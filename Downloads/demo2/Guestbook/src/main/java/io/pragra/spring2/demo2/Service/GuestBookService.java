package io.pragra.spring2.demo2.Service;

import io.pragra.spring2.demo2.Domain.Guest;

import java.util.ArrayList;
import java.util.List;

public class GuestBookService {
    private List<Guest> guests = new ArrayList<>();

    public boolean addGuest(Guest guest){
     return guests.add(guest);
    }

 public boolean removeGuest(Integer id){
        return guests.removeIf(guest -> guest.getId() == id);
  }

    public void showGuest(){
        System.out.println(guests);
    }
}
