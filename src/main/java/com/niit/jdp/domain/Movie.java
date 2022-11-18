/*
 *Author Name: Sneha Shinde
 *Date: 11/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    int movieId;
    String movieName;
    String actorName;
    String directorName;

}
