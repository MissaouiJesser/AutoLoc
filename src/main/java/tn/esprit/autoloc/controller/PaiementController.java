package tn.esprit.autoloc.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.interfaces.IPaiementService;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementController {

    private final IPaiementService paiementService;

    @GetMapping("/retrieve-all-paiements")
    public Set<Paiement> getPaiements() {
        return paiementService.retrieveAllPaiements();
    }

    @GetMapping("/retrieve-paiement/{paiement-id}")
    public Paiement retrievePaiement(@PathVariable("paiement-id") Long paiementId) {
        return paiementService.retrievePaiement(paiementId);
    }

    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return paiementService.addPaiement(paiement);
    }

    @DeleteMapping("/remove-paiement/{paiement-id}")
    public void removePaiement(@PathVariable("paiement-id") Long paiementId) {
        paiementService.removePaiement(paiementId);
    }

    @PutMapping("/modify-paiement")
    public Paiement modifyPaiement(@RequestBody Paiement paiement) {
        return paiementService.modifyPaiement(paiement);
    }
}
