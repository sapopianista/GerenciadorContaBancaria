package service;

import model.ContaCorrente;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ContaService {
    public ContaCorrente lerConta(String caminho) throws IOException{
        List<String> linhas = Files.readAllLines(Paths.get(caminho));
    }
}
