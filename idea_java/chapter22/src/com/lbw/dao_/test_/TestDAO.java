package com.lbw.dao_.test_;

import com.lbw.dao_.dao.ActorDAO;
import com.lbw.dao_.dao.GoodsDAO;
import com.lbw.dao_.domain_.Actor;
import com.lbw.dao_.domain_.Goods;
import org.junit.jupiter.api.Test;

import java.util.List;

// 测试 DAO的功能
public class TestDAO {

    @Test
    public void testActorDAO() {
        ActorDAO actorDAO = new ActorDAO();

        // select 语句
        System.out.println("查询多行记录");
        String sql = "select * from actor";
        List<Actor> actors = actorDAO.selectMulLine(sql, Actor.class);
        System.out.println(actors);

        System.out.println("查询单行记录");
        String sql2 = "select * from actor where id = ?";
        Actor actor = actorDAO.selectSingle(sql2, Actor.class, 1);
        System.out.println(actor);

        System.out.println("查询单行单例记录");
        String sql3 = "select birthday from actor where id = ?";
        Object o = actorDAO.queryScalar(sql3,  1);
        System.out.println(o);


        // dml 语句

        // 插入
//        String sql = "insert into actor values(null,?,?,?,?)";
//        int update = actorDAO.update(sql, "张三", "男", "2012-10-15 00:00:00", "119");

        // 修改
//        String sql = "update actor set id = ? where id = ?";
//        int update = actorDAO.update(sql, 4, 5);

        // 删除
//        String sql = "delete from actor where id = ?";
//        int update = actorDAO.update(sql,4);
//        System.out.println(update > 0 ? "执行成功" : "执行并未对表产生影响！");


    }

    @Test
    public void testGoodsDAO() {
        GoodsDAO goodsDAO = new GoodsDAO();

        // 查询
        //多行查询
//        System.out.println("==== 多行查询 ====");
//        String sql = "select * from goods";
//        List<Goods> goods = goodsDAO.selectMulLine(sql, Goods.class);
//        for(Goods good : goods) {
//            System.out.println(good);
//        }
//        //单行查询
//        System.out.println("==== 单行查询 ====");
//        String sql2 = "select * from goods where id = ?";
//        Goods goods1 = goodsDAO.selectSingle(sql2, Goods.class, 5);
//        System.out.println(goods1);
//
//        // 单行单列查询
//        System.out.println("==== 单行单列查询 ====");
//        String sql3 = "select goods_name from goods where id = ?";
//        Object o = goodsDAO.queryScalar(sql3, 10);
//        System.out.println(o);


        // dml语句
//        String sql = "insert into goods values(?,?,?)";
//        int update = goodsDAO.update(sql, 12, "玻璃珠", 0.5);
//        String sql = "update goods set price = ? where id = ?";
//        int update = goodsDAO.update(sql,0.5,1);

        String sql = "delete from goods where id = ?";
        int update = goodsDAO.update(sql, 7);


        System.out.println(update > 0 ? "执行已对表产生影响" : "执行未对表产生影响");
    }

}
