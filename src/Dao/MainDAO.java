
package Dao;

import java.util.List;

abstract class MainDAO <EntityType, KeyType> {
    abstract public void insert(EntityType entity);
    abstract public void update(EntityType entity);
    abstract public void delete(KeyType id);
    abstract public EntityType selectById(KeyType id);
    abstract List<EntityType> selectAllbyentity(KeyType entity,KeyType a);
    abstract public List<EntityType> selectAll();
    abstract protected List<EntityType> selectBySql(String sql, Object...args);
}
