package in.sp.main.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.sp.main.dao.StudentDao;
import in.sp.main.entity.Student;

@RestController
@CrossOrigin(origins = "*") // allow frontend to call this
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/api/certificate/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentDao.getUserById(id);
    }
}
