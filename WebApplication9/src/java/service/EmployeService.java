package service;

import entities.Employe;

/**
 *
 * @author vanha
 */
public class EmployeService extends AbstractFacade<Employe> {
    

    @Override
    protected Class<Employe> getEntityClass() {
       return Employe.class;
    }
    


    
}
