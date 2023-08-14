[6:11 PM, 8/13/2023] Architha It: ackage com.examly.springapp.service;

import java.util.List;
import com.examly.springapp.repository.TaskRepository;
import com.examly.springapp.entity.Taskentity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // Import the Service annotation
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public Taskentity saveTask(Taskentity taskentity){
        repository.save(taskentity);
        return taskentity;
    }

    public Taskentity updatetaskStatus(String taskId){
        Optional<Taskentity> taskentity = repository.findByTaskId(taskId);
        if(taskentity.isPresent()){
            taskentity.get().setTaskStatus("Accept…
[6:11 PM, 8/13/2023] Architha It: package com.examly.springapp.repository;
import com.examly.springapp.entity.Taskentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
 
@Repository
public interface TaskRepository  extends JpaRepository<Taskentity,String>{
Optional<Taskentity> findByTaskId(String taskid);
void deleteByTaskId(String taskid);

}