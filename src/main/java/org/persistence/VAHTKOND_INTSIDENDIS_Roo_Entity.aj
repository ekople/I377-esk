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
import org.persistence.VAHTKOND_INTSIDENDIS;
import org.springframework.transaction.annotation.Transactional;

privileged aspect VAHTKOND_INTSIDENDIS_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager VAHTKOND_INTSIDENDIS.entityManager;
    
    @Version
    @Column(name = "version")
    private Integer VAHTKOND_INTSIDENDIS.version;
    
    public Integer VAHTKOND_INTSIDENDIS.getVersion() {
        return this.version;
    }
    
    public void VAHTKOND_INTSIDENDIS.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void VAHTKOND_INTSIDENDIS.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void VAHTKOND_INTSIDENDIS.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            VAHTKOND_INTSIDENDIS attached = VAHTKOND_INTSIDENDIS.findVAHTKOND_INTSIDENDIS(this.vahtkondIntsidendisId);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void VAHTKOND_INTSIDENDIS.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void VAHTKOND_INTSIDENDIS.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public VAHTKOND_INTSIDENDIS VAHTKOND_INTSIDENDIS.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        VAHTKOND_INTSIDENDIS merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager VAHTKOND_INTSIDENDIS.entityManager() {
        EntityManager em = new VAHTKOND_INTSIDENDIS().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long VAHTKOND_INTSIDENDIS.countVAHTKOND_INTSIDENDISs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM VAHTKOND_INTSIDENDIS o", Long.class).getSingleResult();
    }
    
    public static List<VAHTKOND_INTSIDENDIS> VAHTKOND_INTSIDENDIS.findAllVAHTKOND_INTSIDENDISs() {
        return entityManager().createQuery("SELECT o FROM VAHTKOND_INTSIDENDIS o", VAHTKOND_INTSIDENDIS.class).getResultList();
    }
    
    public static VAHTKOND_INTSIDENDIS VAHTKOND_INTSIDENDIS.findVAHTKOND_INTSIDENDIS(Long vahtkondIntsidendisId) {
        if (vahtkondIntsidendisId == null) return null;
        return entityManager().find(VAHTKOND_INTSIDENDIS.class, vahtkondIntsidendisId);
    }
    
    public static List<VAHTKOND_INTSIDENDIS> VAHTKOND_INTSIDENDIS.findVAHTKOND_INTSIDENDISEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM VAHTKOND_INTSIDENDIS o", VAHTKOND_INTSIDENDIS.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
