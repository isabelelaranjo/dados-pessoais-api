package br.senac.tads.dsw.dados_pessoais;
import java.time. LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent. ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;

@Service
public class PessoaService {
    private AtomicInteger contador = new AtomicInteger(0);
    private Map<String, Pessoa> mapPessoas = new ConcurrentHashMap<>();

    @PostConstruct

    public void init() {
        // Adiciona algumas pessoas de exemplo
        mapPessoas.put("Isabele", new Pessoa (contador.incrementAndGet(),
        "Isabele", "Isabele Laranjo Souto", 
        "isabelelaranjo@gmail.com","11 99999-9999", LocalDate.parse("2005-01-14")));

        mapPessoas.put("Emilly", new Pessoa (contador.incrementAndGet(),
        "Emilly", "Emilly Marquetti", 
        "emillymarqueti07@gmail.com","11 88888-8888", LocalDate.parse("2006-10-10")));

        mapPessoas.put("Ana", new Pessoa (contador.incrementAndGet(),
        "Ana", "Ana Beatriz",
        "anabeatriz@gmail.com","11 77777-7777", LocalDate.parse("2004-05-20")));
    }

    public List<Pessoa> obterPessoas() {
        return new ArrayList<>(mapPessoas.values());
    }

    public Optional<Pessoa> obterPessoa(String username) {
        return Optional.ofNullable(mapPessoas.get(username));
    }
}


