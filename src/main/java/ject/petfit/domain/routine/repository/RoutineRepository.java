package ject.petfit.domain.routine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ject.petfit.domain.routine.entity.Routine;

public interface RoutineRepository extends JpaRepository<Routine, Long> {
}

