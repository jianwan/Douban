package com.example.wanjian.douban.Bean;

import java.util.List;

/**
 * Created by wanjian on 2017/5/10.
 */

public class Main {


    //即将上映的电影

    /**
     * count : 20
     * start : 0
     * total : 131
     * subjects : [{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","喜剧","家庭"],"title":"麻烦家族","casts":[{"alt":"https://movie.douban.com/celebrity/1037715/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/20776.jpg","large":"https://img3.doubanio.com/img/celebrity/large/20776.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/20776.jpg"},"name":"黄磊","id":"1037715"},{"alt":"https://movie.douban.com/celebrity/1272245/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/49399.jpg","large":"https://img1.doubanio.com/img/celebrity/large/49399.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/49399.jpg"},"name":"海清","id":"1272245"},{"alt":"https://movie.douban.com/celebrity/1317139/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1371453539.51.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1371453539.51.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1371453539.51.jpg"},"name":"王迅","id":"1317139"}],"collect_count":240,"original_title":"麻烦家族","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1037715/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/20776.jpg","large":"https://img3.doubanio.com/img/celebrity/large/20776.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/20776.jpg"},"name":"黄磊","id":"1037715"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2457986350.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2457986350.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2457986350.webp"},"alt":"https://movie.douban.com/subject/26907450/","id":"26907450"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","爱情"],"title":"花腰恋歌","casts":[{"alt":"https://movie.douban.com/celebrity/1373530/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"李哲","id":"1373530"},{"alt":"https://movie.douban.com/celebrity/1323190/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1373426737.1.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1373426737.1.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1373426737.1.jpg"},"name":"季晨","id":"1323190"}],"collect_count":3,"original_title":"花腰恋歌","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1373528/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"彭兰玉","id":"1373528"},{"alt":"https://movie.douban.com/celebrity/1317597/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1467258088.37.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1467258088.37.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1467258088.37.jpg"},"name":"郭明尔","id":"1317597"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2458533638.webp","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2458533638.webp","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2458533638.webp"},"alt":"https://movie.douban.com/subject/26786789/","id":"26786789"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","喜剧","爱情"],"title":"故乡面·参花情","casts":[{"alt":"https://movie.douban.com/celebrity/1373533/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"代晓菲","id":"1373533"},{"alt":"https://movie.douban.com/celebrity/1322898/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1358956358.51.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1358956358.51.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1358956358.51.jpg"},"name":"孙雅","id":"1322898"},{"alt":"https://movie.douban.com/celebrity/1332577/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"方辉","id":"1332577"}],"collect_count":1,"original_title":"故乡面·参花情","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1372155/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"胡平","id":"1372155"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2458528731.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2458528731.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2458528731.webp"},"alt":"https://movie.douban.com/subject/26393418/","id":"26393418"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","动作","奇幻"],"title":"亚瑟王：斗兽争霸","casts":[{"alt":"https://movie.douban.com/celebrity/1000024/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/692.jpg","large":"https://img3.doubanio.com/img/celebrity/large/692.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/692.jpg"},"name":"查理·汉纳姆","id":"1000024"},{"alt":"https://movie.douban.com/celebrity/1010510/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/107.jpg","large":"https://img1.doubanio.com/img/celebrity/large/107.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/107.jpg"},"name":"裘德·洛","id":"1010510"},{"alt":"https://movie.douban.com/celebrity/1227601/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/49924.jpg","large":"https://img3.doubanio.com/img/celebrity/large/49924.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/49924.jpg"},"name":"阿斯特丽德·伯格斯-弗瑞斯贝","id":"1227601"}],"collect_count":286,"original_title":"King Arthur: Legend of the Sword","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1025148/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/47189.jpg","large":"https://img1.doubanio.com/img/celebrity/large/47189.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/47189.jpg"},"name":"盖·里奇","id":"1025148"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2453433569.webp","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2453433569.webp","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2453433569.webp"},"alt":"https://movie.douban.com/subject/25864124/","id":"25864124"},{"rating":{"max":10,"average":7.4,"stars":"40","min":0},"genres":["剧情","喜剧","犯罪"],"title":"提着心吊着胆","casts":[{"alt":"https://movie.douban.com/celebrity/1367526/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1489073179.47.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1489073179.47.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1489073179.47.jpg"},"name":"陈玺旭","id":"1367526"},{"alt":"https://movie.douban.com/celebrity/1322964/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1488524026.09.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1488524026.09.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1488524026.09.jpg"},"name":"高叶","id":"1322964"},{"alt":"https://movie.douban.com/celebrity/1362973/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1478066140.77.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1478066140.77.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1478066140.77.jpg"},"name":"任素汐","id":"1362973"}],"collect_count":1696,"original_title":"提着心吊着胆","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1367529/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1488524202.85.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1488524202.85.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1488524202.85.jpg"},"name":"李雨禾","id":"1367529"}],"year":"2016","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2456976809.webp","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2456976809.webp","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2456976809.webp"},"alt":"https://movie.douban.com/subject/26808466/","id":"26808466"},{"rating":{"max":10,"average":5.3,"stars":"30","min":0},"genres":["动作","科幻","冒险"],"title":"超凡战队","casts":[{"alt":"https://movie.douban.com/celebrity/1354781/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1455882928.42.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1455882928.42.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1455882928.42.jpg"},"name":"戴克·蒙哥马利","id":"1354781"},{"alt":"https://movie.douban.com/celebrity/1325313/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/lt1qAVboeQcel_avatar_uploaded1354000222.28.jpg","large":"https://img1.doubanio.com/img/celebrity/large/lt1qAVboeQcel_avatar_uploaded1354000222.28.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/lt1qAVboeQcel_avatar_uploaded1354000222.28.jpg"},"name":"娜奥米·斯科特","id":"1325313"},{"alt":"https://movie.douban.com/celebrity/1350258/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1436094709.46.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1436094709.46.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1436094709.46.jpg"},"name":"RJ·赛勒","id":"1350258"}],"collect_count":691,"original_title":"Power Rangers","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1347803/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1484228323.56.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1484228323.56.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1484228323.56.jpg"},"name":"迪恩·以色列特","id":"1347803"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2441013548.webp","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2441013548.webp","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2441013548.webp"},"alt":"https://movie.douban.com/subject/25881615/","id":"25881615"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","动作","犯罪"],"title":"毒。诫","casts":[{"alt":"https://movie.douban.com/celebrity/1007251/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/844.jpg","large":"https://img3.doubanio.com/img/celebrity/large/844.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/844.jpg"},"name":"刘青云","id":"1007251"},{"alt":"https://movie.douban.com/celebrity/1050329/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1408428669.04.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1408428669.04.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1408428669.04.jpg"},"name":"林家栋","id":"1050329"},{"alt":"https://movie.douban.com/celebrity/1027577/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1419164245.74.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1419164245.74.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1419164245.74.jpg"},"name":"古天乐","id":"1027577"}],"collect_count":53,"original_title":"毒。誡","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1276870/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/33943.jpg","large":"https://img3.doubanio.com/img/celebrity/large/33943.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/33943.jpg"},"name":"刘国昌","id":"1276870"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2457738034.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2457738034.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2457738034.webp"},"alt":"https://movie.douban.com/subject/26605946/","id":"26605946"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["惊悚","恐怖"],"title":"碟仙前传","casts":[{"alt":"https://movie.douban.com/celebrity/1373535/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"王右硕","id":"1373535"},{"alt":"https://movie.douban.com/celebrity/1313886/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/21071.jpg","large":"https://img3.doubanio.com/img/celebrity/large/21071.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/21071.jpg"},"name":"伊娜","id":"1313886"},{"alt":"https://movie.douban.com/celebrity/1358158/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"郭若寒","id":"1358158"}],"collect_count":32,"original_title":"碟仙前传","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1351882/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"高育新","id":"1351882"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2457736160.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2457736160.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2457736160.webp"},"alt":"https://movie.douban.com/subject/26950073/","id":"26950073"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","喜剧"],"title":"以爱为名","casts":[{"alt":"https://movie.douban.com/celebrity/1322951/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/57216.jpg","large":"https://img3.doubanio.com/img/celebrity/large/57216.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/57216.jpg"},"name":"王奕瑾","id":"1322951"},{"alt":"https://movie.douban.com/celebrity/1335432/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1387179791.12.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1387179791.12.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1387179791.12.jpg"},"name":"黄恺杰","id":"1335432"},{"alt":"https://movie.douban.com/celebrity/1373539/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1494327698.63.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1494327698.63.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1494327698.63.jpg"},"name":"卞庆华","id":"1373539"}],"collect_count":1,"original_title":"以愛為名","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1307461/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/39953.jpg","large":"https://img3.doubanio.com/img/celebrity/large/39953.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/39953.jpg"},"name":"王毓雅","id":"1307461"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2458491427.webp","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2458491427.webp","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2458491427.webp"},"alt":"https://movie.douban.com/subject/26596836/","id":"26596836"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","喜剧","爱情"],"title":"小满的故事之青涩年华","casts":[{"alt":"https://movie.douban.com/celebrity/1373544/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"陈绍文","id":"1373544"},{"alt":"https://movie.douban.com/celebrity/1373545/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"何佳颜","id":"1373545"},{"alt":"https://movie.douban.com/celebrity/1373546/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"齐天","id":"1373546"}],"collect_count":1,"original_title":"小满的故事之青涩年华","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1373542/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"三刚","id":"1373542"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2456604528.webp","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2456604528.webp","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2456604528.webp"},"alt":"https://movie.douban.com/subject/26786794/","id":"26786794"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情"],"title":"阿文的承诺","casts":[{"alt":"https://movie.douban.com/celebrity/1321589/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1465789855.76.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1465789855.76.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1465789855.76.jpg"},"name":"李梦男","id":"1321589"},{"alt":null,"avatars":null,"name":"董超","id":null},{"alt":"https://movie.douban.com/celebrity/1317150/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1464840727.17.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1464840727.17.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1464840727.17.jpg"},"name":"李彦明","id":"1317150"}],"collect_count":0,"original_title":"阿文的承诺","subtype":"movie","directors":[{"alt":null,"avatars":null,"name":"程锋","id":null}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2458622669.webp","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2458622669.webp","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2458622669.webp"},"alt":"https://movie.douban.com/subject/27040567/","id":"27040567"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","家庭"],"title":"宝贝，再爱我一次","casts":[{"alt":"https://movie.douban.com/celebrity/1315637/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1488525073.31.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1488525073.31.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1488525073.31.jpg"},"name":"潘时七","id":"1315637"},{"alt":"https://movie.douban.com/celebrity/1372481/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1492879104.82.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1492879104.82.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1492879104.82.jpg"},"name":"方妤萌","id":"1372481"},{"alt":"https://movie.douban.com/celebrity/1342726/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1415087998.91.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1415087998.91.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1415087998.91.jpg"},"name":"石峯","id":"1342726"}],"collect_count":2,"original_title":"宝贝，再爱我一次","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1372480/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1492879077.34.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1492879077.34.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1492879077.34.jpg"},"name":"刘学见","id":"1372480"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2458519293.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2458519293.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2458519293.webp"},"alt":"https://movie.douban.com/subject/27027635/","id":"27027635"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情"],"title":"镇巴女子","casts":[{"alt":"https://movie.douban.com/celebrity/1355651/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1458100831.71.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1458100831.71.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1458100831.71.jpg"},"name":"贾雨萌","id":"1355651"},{"alt":"https://movie.douban.com/celebrity/1330223/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1460514231.21.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1460514231.21.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1460514231.21.jpg"},"name":"童振军","id":"1330223"},{"alt":null,"avatars":null,"name":"郭佳","id":null}],"collect_count":0,"original_title":"镇巴女子","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1324564/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"方义华","id":"1324564"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2458623359.webp","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2458623359.webp","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2458623359.webp"},"alt":"https://movie.douban.com/subject/27040579/","id":"27040579"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情"],"title":"20:16","casts":[{"alt":"https://movie.douban.com/celebrity/1028689/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/2569.jpg","large":"https://img1.doubanio.com/img/celebrity/large/2569.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/2569.jpg"},"name":"刘松仁","id":"1028689"},{"alt":"https://movie.douban.com/celebrity/1330093/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1372780163.24.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1372780163.24.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1372780163.24.jpg"},"name":"吕星辰","id":"1330093"},{"alt":"https://movie.douban.com/celebrity/1315986/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/34575.jpg","large":"https://img3.doubanio.com/img/celebrity/large/34575.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/34575.jpg"},"name":"吴俊余","id":"1315986"}],"collect_count":2,"original_title":"20:16","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1372775/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1493267729.41.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1493267729.41.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1493267729.41.jpg"},"name":"吕列","id":"1372775"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2457649904.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2457649904.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2457649904.webp"},"alt":"https://movie.douban.com/subject/27031469/","id":"27031469"},{"rating":{"max":10,"average":7.1,"stars":"35","min":0},"genres":["科幻","惊悚","恐怖"],"title":"异星觉醒","casts":[{"alt":"https://movie.douban.com/celebrity/1048002/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/12737.jpg","large":"https://img1.doubanio.com/img/celebrity/large/12737.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/12737.jpg"},"name":"杰克·吉伦哈尔","id":"1048002"},{"alt":"https://movie.douban.com/celebrity/1088314/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1376924506.04.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1376924506.04.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1376924506.04.jpg"},"name":"丽贝卡·弗格森","id":"1088314"},{"alt":"https://movie.douban.com/celebrity/1053623/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/48608.jpg","large":"https://img1.doubanio.com/img/celebrity/large/48608.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/48608.jpg"},"name":"瑞恩·雷诺兹","id":"1053623"}],"collect_count":3019,"original_title":"Life","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1000735/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1371181573.89.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1371181573.89.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1371181573.89.jpg"},"name":"丹尼尔·伊斯皮诺萨","id":"1000735"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2456571580.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2456571580.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2456571580.webp"},"alt":"https://movie.douban.com/subject/26718838/","id":"26718838"},{"rating":{"max":10,"average":7.1,"stars":"35","min":0},"genres":["剧情","儿童","奇幻"],"title":"当怪物来敲门","casts":[{"alt":"https://movie.douban.com/celebrity/1352348/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1474008785.38.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1474008785.38.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1474008785.38.jpg"},"name":"刘易斯·麦克杜格尔","id":"1352348"},{"alt":"https://movie.douban.com/celebrity/1053569/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/513.jpg","large":"https://img3.doubanio.com/img/celebrity/large/513.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/513.jpg"},"name":"西格妮·韦弗","id":"1053569"},{"alt":"https://movie.douban.com/celebrity/1013981/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/42373.jpg","large":"https://img3.doubanio.com/img/celebrity/large/42373.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/42373.jpg"},"name":"菲丽希缇·琼斯","id":"1013981"}],"collect_count":8957,"original_title":"A Monster Calls","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1305510/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1372318484.25.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1372318484.25.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1372318484.25.jpg"},"name":"胡安·安东尼奥·巴亚纳","id":"1305510"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2457871671.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2457871671.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2457871671.webp"},"alt":"https://movie.douban.com/subject/25872311/","id":"25872311"},{"rating":{"max":10,"average":4.1,"stars":"20","min":0},"genres":["动作","科幻"],"title":"守护者：世纪战元","casts":[{"alt":"https://movie.douban.com/celebrity/1356439/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1472093933.66.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1472093933.66.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1472093933.66.jpg"},"name":"塞巴斯蒂安·斯萨克","id":"1356439"},{"alt":"https://movie.douban.com/celebrity/1361358/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1472058182.23.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1472058182.23.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1472058182.23.jpg"},"name":"艾琳娜·拉尼娜","id":"1361358"},{"alt":"https://movie.douban.com/celebrity/1356438/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1472093757.86.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1472093757.86.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1472093757.86.jpg"},"name":"安东·庞布施尼","id":"1356438"}],"collect_count":2624,"original_title":"Защитники","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1356430/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1486970877.16.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1486970877.16.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1486970877.16.jpg"},"name":"萨里·奥德赛耶","id":"1356430"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2436569073.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2436569073.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2436569073.webp"},"alt":"https://movie.douban.com/subject/26589957/","id":"26589957"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["动作","犯罪"],"title":"抢红","casts":[{"alt":"https://movie.douban.com/celebrity/1274319/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/49047.jpg","large":"https://img1.doubanio.com/img/celebrity/large/49047.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/49047.jpg"},"name":"张涵予","id":"1274319"},{"alt":"https://movie.douban.com/celebrity/1036978/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1503.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1503.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1503.jpg"},"name":"黎明","id":"1036978"},{"alt":"https://movie.douban.com/celebrity/1316330/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1407300415.4.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1407300415.4.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1407300415.4.jpg"},"name":"王耀庆","id":"1316330"}],"collect_count":84,"original_title":"抢红","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1036978/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1503.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1503.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1503.jpg"},"name":"黎明","id":"1036978"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2458368616.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2458368616.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2458368616.webp"},"alt":"https://movie.douban.com/subject/26661183/","id":"26661183"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["喜剧","爱情"],"title":"不期而遇","casts":[{"alt":"https://movie.douban.com/celebrity/1274494/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/25096.jpg","large":"https://img3.doubanio.com/img/celebrity/large/25096.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/25096.jpg"},"name":"张雨绮","id":"1274494"},{"alt":"https://movie.douban.com/celebrity/1335644/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1385196496.79.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1385196496.79.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1385196496.79.jpg"},"name":"张亮","id":"1335644"}],"collect_count":106,"original_title":"不期而遇","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1320991/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/50686.jpg","large":"https://img3.doubanio.com/img/celebrity/large/50686.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/50686.jpg"},"name":"陈卓","id":"1320991"}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2458370286.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2458370286.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2458370286.webp"},"alt":"https://movie.douban.com/subject/26287783/","id":"26287783"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情"],"title":"美容针","casts":[{"alt":"https://movie.douban.com/celebrity/1274496/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1420531092.61.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1420531092.61.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1420531092.61.jpg"},"name":"闫妮","id":"1274496"},{"alt":"https://movie.douban.com/celebrity/1326549/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1359690025.23.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1359690025.23.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1359690025.23.jpg"},"name":"杜天皓","id":"1326549"}],"collect_count":22,"original_title":"美容针","subtype":"movie","directors":[{"alt":null,"avatars":null,"name":"黄美娜","id":null}],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2441787151.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2441787151.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2441787151.webp"},"alt":"https://movie.douban.com/subject/26779288/","id":"26779288"}]
     * title : 即将上映的电影
     */

    private int count;
    private int start;
    private int total;
    private String title;
    private List<SubjectsBean> subjects;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubjectsBean> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsBean> subjects) {
        this.subjects = subjects;
    }

    public static class SubjectsBean {
        /**
         * rating : {"max":10,"average":0,"stars":"00","min":0}
         * genres : ["剧情","喜剧","家庭"]
         * title : 麻烦家族
         * casts : [{"alt":"https://movie.douban.com/celebrity/1037715/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/20776.jpg","large":"https://img3.doubanio.com/img/celebrity/large/20776.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/20776.jpg"},"name":"黄磊","id":"1037715"},{"alt":"https://movie.douban.com/celebrity/1272245/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/49399.jpg","large":"https://img1.doubanio.com/img/celebrity/large/49399.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/49399.jpg"},"name":"海清","id":"1272245"},{"alt":"https://movie.douban.com/celebrity/1317139/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1371453539.51.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1371453539.51.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1371453539.51.jpg"},"name":"王迅","id":"1317139"}]
         * collect_count : 240
         * original_title : 麻烦家族
         * subtype : movie
         * directors : [{"alt":"https://movie.douban.com/celebrity/1037715/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/20776.jpg","large":"https://img3.doubanio.com/img/celebrity/large/20776.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/20776.jpg"},"name":"黄磊","id":"1037715"}]
         * year : 2017
         * images : {"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2457986350.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2457986350.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2457986350.webp"}
         * alt : https://movie.douban.com/subject/26907450/
         * id : 26907450
         */

        private RatingBean rating;
        private String title;
        private int collect_count;
        private String original_title;
        private String subtype;
        private String year;
        private ImagesBean images;
        private String alt;
        private String id;
        private List<String> genres;
        private List<CastsBean> casts;
        private List<DirectorsBean> directors;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCollect_count() {
            return collect_count;
        }

        public void setCollect_count(int collect_count) {
            this.collect_count = collect_count;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public List<CastsBean> getCasts() {
            return casts;
        }

        public void setCasts(List<CastsBean> casts) {
            this.casts = casts;
        }

        public List<DirectorsBean> getDirectors() {
            return directors;
        }

        public void setDirectors(List<DirectorsBean> directors) {
            this.directors = directors;
        }

        public static class RatingBean {
            /**
             * max : 10
             * average : 0
             * stars : 00
             * min : 0
             */

            private int max;
            private int average;
            private String stars;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getAverage() {
                return average;
            }

            public void setAverage(int average) {
                this.average = average;
            }

            public String getStars() {
                return stars;
            }

            public void setStars(String stars) {
                this.stars = stars;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2457986350.webp
             * large : https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2457986350.webp
             * medium : https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2457986350.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class CastsBean {
            /**
             * alt : https://movie.douban.com/celebrity/1037715/
             * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/20776.jpg","large":"https://img3.doubanio.com/img/celebrity/large/20776.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/20776.jpg"}
             * name : 黄磊
             * id : 1037715
             */

            private String alt;
            private AvatarsBean avatars;
            private String name;
            private String id;

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public AvatarsBean getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBean avatars) {
                this.avatars = avatars;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBean {
                /**
                 * small : https://img3.doubanio.com/img/celebrity/small/20776.jpg
                 * large : https://img3.doubanio.com/img/celebrity/large/20776.jpg
                 * medium : https://img3.doubanio.com/img/celebrity/medium/20776.jpg
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }

        public static class DirectorsBean {
            /**
             * alt : https://movie.douban.com/celebrity/1037715/
             * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/20776.jpg","large":"https://img3.doubanio.com/img/celebrity/large/20776.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/20776.jpg"}
             * name : 黄磊
             * id : 1037715
             */

            private String alt;
            private AvatarsBeanX avatars;
            private String name;
            private String id;

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public AvatarsBeanX getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBeanX avatars) {
                this.avatars = avatars;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBeanX {
                /**
                 * small : https://img3.doubanio.com/img/celebrity/small/20776.jpg
                 * large : https://img3.doubanio.com/img/celebrity/large/20776.jpg
                 * medium : https://img3.doubanio.com/img/celebrity/medium/20776.jpg
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }
    }
}
