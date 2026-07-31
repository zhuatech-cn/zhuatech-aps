/* Copyright 2026 上海如静知华信息科技有限公司 */
export const workOrders=[
 {id:1,no:'PLN-260731-018',product:'智能执行器 AX120',code:'FG-AX120',center:'总装资源组',workshop:'装配车间',plan:1200,done:864,defect:12,due:'07-31',batch:'B260731A',status:'执行中',progress:72,priority:'插单'},
 {id:2,no:'PLN-260731-021',product:'精密减速器 DR80',code:'FG-DR80',center:'精加工资源组',workshop:'机加车间',plan:680,done:272,defect:7,due:'08-01',batch:'B260731C',status:'执行中',progress:40,priority:'正常'},
 {id:3,no:'PLN-260801-006',product:'工业采集模块 IO16',code:'FG-IO16',center:'电子装联资源组',workshop:'电子车间',plan:1500,done:0,defect:0,due:'08-02',batch:'B260801B',status:'已锁定',progress:0,priority:'正常'},
 {id:4,no:'PLN-260730-015',product:'伺服驱动器 SV40',code:'FG-SV40',center:'功能测试资源组',workshop:'检测车间',plan:960,done:960,defect:9,due:'07-31',batch:'B260730D',status:'已完成',progress:100,priority:'正常'},
 {id:5,no:'PLN-260731-024',product:'运动控制器 MC8',code:'FG-MC08',center:'SMT 资源组',workshop:'电子车间',plan:820,done:516,defect:5,due:'08-01',batch:'B260731E',status:'待重排',progress:63,priority:'关注'}]
export const equipment=[
 {code:'RES-AS-011',name:'总装一号资源组',center:'总装资源组',status:'已排满',oee:86,beat:'18.6s',note:'未来 24h 负荷 96%'},
 {code:'RES-AS-014',name:'扭矩锁付工作站',center:'总装资源组',status:'可用',oee:91,beat:'12.4s',note:'可插入 1.8 小时任务'},
 {code:'RES-MC-027',name:'五轴加工中心',center:'精加工资源组',status:'过载',oee:64,beat:'—',note:'08-01 预计超负荷 3.5h'},
 {code:'RES-TS-006',name:'综合性能测试台',center:'功能测试资源组',status:'可用',oee:78,beat:'31.2s',note:'换型窗口 13:30—14:10'}]
export const inspections=[
 {no:'CHK-260731-003',order:'PLN-260801-006',product:'工业采集模块 IO16',type:'物料齐套校验',sample:5,defect:0,result:'待校验',inspector:'系统'},
 {no:'CHK-260731-011',order:'PLN-260731-021',product:'精密减速器 DR80',type:'产能约束校验',sample:5,defect:1,result:'冲突',inspector:'周妍'},
 {no:'CHK-260731-032',order:'PLN-260731-018',product:'智能执行器 AX120',type:'交期约束校验',sample:20,defect:0,result:'通过',inspector:'系统'},
 {no:'CHK-260730-018',order:'PLN-260730-015',product:'伺服驱动器 SV40',type:'换型约束校验',sample:32,defect:0,result:'通过',inspector:'陆承'}]
export const adminMetrics=[['今日排程量','5,160','18 张计划订单 · 4 个资源组','blue'],['计划达成率','92.7%','较上周提升 3.8%','green'],['准时交付率','96.8%','目标值 ≥ 96.0%','orange'],['产能冲突','3','其中 1 项影响交期','red']]
export const shopMetrics=[['本班计划','1,200','智能执行器 AX120','blue'],['已反馈','864','当前达成 72%','green'],['待处理异常','2','物料 1 · 资源 1','orange'],['预计完工','17:48','较计划提前 12 分钟','slate']]
export const hourly=[120,186,276,364,452,548,650,756,864]
