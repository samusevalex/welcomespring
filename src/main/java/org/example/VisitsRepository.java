package org.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface VisitsRepository extends CrudRepository<Visit, Long> {
}