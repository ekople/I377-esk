// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.persistence;

import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.persistence.PIIRIVALVURI_SEADUS_INTSIDENDI;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PIIRIVALVURI_SEADUS_INTSIDENDI_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager PIIRIVALVURI_SEADUS_INTSIDENDI.entityManager;
    
    @Version
    @Column(name = "version")
    private Integer PIIRIVALVURI_SEADUS_INTSIDENDI.version;
    
    public Integer PIIRIVALVURI_SEADUS_INTSIDENDI.getVersion() {
        return this.version;
    }
    
    public void PIIRIVALVURI_SEADUS_INTSIDENDI.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void PIIRIVALVURI_SEADUS_INTSIDENDI.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void PIIRIVALVURI_SEADUS_INTSIDENDI.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            PIIRIVALVURI_SEADUS_INTSIDENDI attached = PIIRIVALVURI_SEADUS_INTSIDENDI.findPIIRIVALVURI_SEADUS_INTSIDENDI(this.piirivalvuriSeadusIntsidendi);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void PIIRIVALVURI_SEADUS_INTSIDENDI.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void PIIRIVALVURI_SEADUS_INTSIDENDI.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public PIIRIVALVURI_SEADUS_INTSIDENDI PIIRIVALVURI_SEADUS_INTSIDENDI.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        PIIRIVALVURI_SEADUS_INTSIDENDI merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager PIIRIVALVURI_SEADUS_INTSIDENDI.entityManager() {
        EntityManager em = new PIIRIVALVURI_SEADUS_INTSIDENDI().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long PIIRIVALVURI_SEADUS_INTSIDENDI.countPIIRIVALVURI_SEADUS_INTSIDENDIs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM PIIRIVALVURI_SEADUS_INTSIDENDI o WHERE o.suletud > CURRENT_DATE", Long.class).getSingleResult();
    }
    
    public static List<PIIRIVALVURI_SEADUS_INTSIDENDI> PIIRIVALVURI_SEADUS_INTSIDENDI.findAllPIIRIVALVURI_SEADUS_INTSIDENDIs() {
        return entityManager().createQuery("SELECT o FROM PIIRIVALVURI_SEADUS_INTSIDENDI o WHERE o.suletud > CURRENT_DATE", PIIRIVALVURI_SEADUS_INTSIDENDI.class).getResultList();
    }
    
    public static PIIRIVALVURI_SEADUS_INTSIDENDI PIIRIVALVURI_SEADUS_INTSIDENDI.findPIIRIVALVURI_SEADUS_INTSIDENDI(Long piirivalvuriSeadusIntsidendi) {
        if (piirivalvuriSeadusIntsidendi == null) return null;
        return entityManager().find(PIIRIVALVURI_SEADUS_INTSIDENDI.class, piirivalvuriSeadusIntsidendi);
    }
    
    public static List<PIIRIVALVURI_SEADUS_INTSIDENDI> PIIRIVALVURI_SEADUS_INTSIDENDI.findPIIRIVALVURI_SEADUS_INTSIDENDIEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM PIIRIVALVURI_SEADUS_INTSIDENDI o WHERE o.suletud > CURRENT_DATE", PIIRIVALVURI_SEADUS_INTSIDENDI.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
