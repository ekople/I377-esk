// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package main.entities;

import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import main.entities.Kodakondsus;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Kodakondsus_Roo_Entity {
    
    declare @type: Kodakondsus: @Entity;
    
    @PersistenceContext
    transient EntityManager Kodakondsus.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Kodakondsus.id;
    
    @Version
    @Column(name = "version")
    private Integer Kodakondsus.version;
    
    public Long Kodakondsus.getId() {
        return this.id;
    }
    
    public void Kodakondsus.setId(Long id) {
        this.id = id;
    }
    
    public Integer Kodakondsus.getVersion() {
        return this.version;
    }
    
    public void Kodakondsus.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Kodakondsus.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Kodakondsus.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Kodakondsus attached = Kodakondsus.findKodakondsus(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Kodakondsus.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Kodakondsus.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Kodakondsus Kodakondsus.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Kodakondsus merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager Kodakondsus.entityManager() {
        EntityManager em = new Kodakondsus().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Kodakondsus.countKodakondsuses() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Kodakondsus o", Long.class).getSingleResult();
    }
    
    public static List<Kodakondsus> Kodakondsus.findAllKodakondsuses() {
        return entityManager().createQuery("SELECT o FROM Kodakondsus o", Kodakondsus.class).getResultList();
    }
    
    public static Kodakondsus Kodakondsus.findKodakondsus(Long id) {
        if (id == null) return null;
        return entityManager().find(Kodakondsus.class, id);
    }
    
    public static List<Kodakondsus> Kodakondsus.findKodakondsusEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Kodakondsus o", Kodakondsus.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}