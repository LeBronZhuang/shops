package com.shop.controller;

import com.shop.entity.Favorite;
import com.shop.service.FavoriteService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Favorite)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:07:08
 */
@RestController
@RequestMapping("favorite")
public class FavoriteController {
    /**
     * 服务对象
     */
    @Resource
    private FavoriteService favoriteService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Favorite selectOne(Integer id) {
        return this.favoriteService.queryById(id);
    }

}