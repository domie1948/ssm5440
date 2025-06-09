
var projectName = '小说阅读网站';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '小说信息',
	url: './pages/xiaoshuoxinxi/list.jsp'
}, 

]

var adminurl =  "http://localhost:8080/jspm691px/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"读者","menuJump":"列表","tableName":"duzhe"}],"menu":"读者管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"作者","menuJump":"列表","tableName":"zuozhe"}],"menu":"作者管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","查看评论"],"menu":"小说信息","menuJump":"列表","tableName":"xiaoshuoxinxi"}],"menu":"小说信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"小说分类","menuJump":"列表","tableName":"xiaoshuofenlei"}],"menu":"小说分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"余额充值","menuJump":"列表","tableName":"yuechongzhi"}],"menu":"余额充值管理"},{"child":[{"buttons":["新增","查看","修改","删除","下载"],"menu":"购买小说","menuJump":"列表","tableName":"goumaixiaoshuo"}],"menu":"购买小说管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"下载小说","menuJump":"列表","tableName":"xiazaixiaoshuo"}],"menu":"下载小说管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"小说信息列表","menuJump":"列表","tableName":"xiaoshuoxinxi"}],"menu":"小说信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","支付"],"menu":"余额充值","menuJump":"列表","tableName":"yuechongzhi"}],"menu":"余额充值管理"},{"child":[{"buttons":["查看","删除","支付"],"menu":"购买小说","menuJump":"列表","tableName":"goumaixiaoshuo"}],"menu":"购买小说管理"},{"child":[{"buttons":["查看"],"menu":"下载小说","menuJump":"列表","tableName":"xiazaixiaoshuo"}],"menu":"下载小说管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"小说信息列表","menuJump":"列表","tableName":"xiaoshuoxinxi"}],"menu":"小说信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"读者","tableName":"duzhe"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","审核","查看评论","购买","支付"],"menu":"小说信息","menuJump":"列表","tableName":"xiaoshuoxinxi"}],"menu":"小说信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"小说分类","menuJump":"列表","tableName":"xiaoshuofenlei"}],"menu":"小说分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","支付"],"menu":"余额充值","menuJump":"列表","tableName":"yuechongzhi"}],"menu":"余额充值管理"},{"child":[{"buttons":["查看","修改","删除","支付"],"menu":"购买小说","menuJump":"列表","tableName":"goumaixiaoshuo"}],"menu":"购买小说管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"下载小说","menuJump":"列表","tableName":"xiazaixiaoshuo"}],"menu":"下载小说管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"小说信息列表","menuJump":"列表","tableName":"xiaoshuoxinxi"}],"menu":"小说信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"作者","tableName":"zuozhe"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
