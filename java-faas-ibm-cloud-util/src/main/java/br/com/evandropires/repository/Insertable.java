package br.com.evandropires.repository;

import com.cloudant.client.api.model.Response;

/**
 * Created by evandro on 16/05/18.
 */
public interface Insertable {

    Response insert(Object object);

}
