package com.example.dzr.Repository;

import com.example.dzr.Entity.Trains.Station;
import com.example.dzr.Entity.Trains.Train;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainRepository extends JpaRepository<Train, Long> {
    Train findTrainById(Long id);

}
