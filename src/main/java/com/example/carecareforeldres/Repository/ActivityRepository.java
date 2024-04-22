package com.example.carecareforeldres.Repository;

import com.example.carecareforeldres.Entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity,Long> {
}
