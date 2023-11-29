package domaines;

import entities.Employe;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import service.EmployeService;

@ManagedBean
@RequestScoped
public class EmployeBean {

    private Employe employe;
    private List<Employe> employes;
    private EmployeService employeService;

    /**
     * Creates a new instance of EmployeBean
     */
    public EmployeBean() {
        employe = new Employe();
        employeService = new EmployeService();
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public void onCreateAction() {
        employeService.create(employe);
        employe = new Employe();
    }

    public List<Employe> getEmployes() {
        if (employes == null) {
            employes = employeService.getAll();
        }
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
}
