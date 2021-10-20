package pl.klekocinska.filesstorage.menager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import pl.klekocinska.filesstorage.DAO.FileRepository;
import pl.klekocinska.filesstorage.DAO.entity.File;

import java.util.Optional;

@Service
public class FileService {

    private FileRepository fileRepository;

    @Autowired
    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public Optional<File> getById(@RequestParam Long index){
        return fileRepository.findById(index);
    }

    public Iterable<File> getAll(){
        return fileRepository.findAll();
    }

    public File save(@RequestBody File newFile){
        return fileRepository.save(newFile);
    }

    public void deleteByID(@RequestParam Long index){
        fileRepository.deleteById(index);
    }


}
