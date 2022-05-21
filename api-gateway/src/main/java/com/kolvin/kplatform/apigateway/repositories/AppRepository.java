package com.kolvin.kplatform.apigateway.repositories;

import com.kolvin.kplatform.apigateway.models.App;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepository extends JpaRepository<App, Integer> {
}
