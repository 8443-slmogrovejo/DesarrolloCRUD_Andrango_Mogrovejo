//UserRepository

package com.example.RegistroUsuariosApplication.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface TaskRepository extends JpaRepository<Task, Long> {

    Optional<Task> findProductsByName(String name);

}