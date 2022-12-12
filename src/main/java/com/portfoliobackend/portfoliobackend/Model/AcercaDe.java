
package com.portfoliobackend.portfoliobackend.Model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Getter @Setter
@Entity
public class AcercaDe implements Serializable {
    
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    
    @GeneratedValue(generator="hibernate_sequence")
    @SequenceGenerator(name="hibernate_sequence", 
                        sequenceName="acercade_sequence")
    @Column(name="id", unique= true, nullable=false)

    private Long id;
    
    //@Column(nullable=false, unique=true, length=50) ej.
    
    @Column(nullable=false, length=1000)
    private String info;
    
 
    public AcercaDe() {
    }

    public AcercaDe(Long id, String info) {
        this.id = id;
        this.info = info;
    }
    
    
    
    
    
    
    
}
