package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * Created by yangyu on 20/8/17.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long id);
}
