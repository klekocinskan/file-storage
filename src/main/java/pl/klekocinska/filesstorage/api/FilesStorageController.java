package pl.klekocinska.filesstorage.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;
import pl.klekocinska.filesstorage.DAO.entity.File;
import pl.klekocinska.filesstorage.menager.FileService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FilesStorageController {

    private FileService fileService;

    @Autowired
    public FilesStorageController(FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("/all")
    public Iterable<File> getAll(){
        return fileService.getAll();
    }

    @GetMapping
    public Optional<File> getById(@RequestParam Long index){
        return fileService.getById(index);
    }

    @PostMapping
    public File addFile(@RequestBody File newFile){
        return fileService.save(newFile);
    }

    @PutMapping
    public File updateFile(@RequestBody File newFile){
        return fileService.save(newFile);
    }

    @DeleteMapping
    public void deleteVideoById(@RequestParam Long index){
        fileService.deleteByID(index);
    }

    /*
    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
       addFile(new File(1L,"doc","Jan Janowski", LocalDate.of(2021,01,01), 85));

    }
*/

}
