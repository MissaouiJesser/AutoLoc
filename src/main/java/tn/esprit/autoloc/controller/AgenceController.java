package tn.esprit.autoloc.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.interfaces.IAgenceService;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceController {

    private final IAgenceService agenceService;

    @GetMapping("/retrieve-all-agences")
    public Set<Agence> getAgences() {
        return agenceService.retrieveAllAgences();
    }

    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long agenceId) {
        return agenceService.retrieveAgence(agenceId);
    }

    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    @DeleteMapping("/remove-agence/{agence-id}")
    public void removeAgence(@PathVariable("agence-id") Long agenceId) {
        agenceService.removeAgence(agenceId);
    }

    @PutMapping("/modify-agence")
    public Agence modifyAgence(@RequestBody Agence agence) {
        return agenceService.modifyAgence(agence);
    }
}
