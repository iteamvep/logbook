package logbook.data;

/**
 * データが何を示すのかを列挙する
 *
 */
public enum DataType {

    /** 補給 */
    CHARGE("/kcsapi/api_req_hokyu/charge"),
    /** 編成 */
    CHANGE("/kcsapi/api_req_hensei/change"),
    /** 母港 */
    PORT("/kcsapi/api_port/port"),
    /** 保有艦 */
    SHIP2("/kcsapi/api_get_member/ship2"),
    /** 保有艦 */
    SHIP3("/kcsapi/api_get_member/ship3"),
    /** 遠征(帰還) */
    MISSION_RESULT("/kcsapi/api_req_mission/result"),
    /** 基本 */
    BASIC("/kcsapi/api_get_member/basic"),
    /** 資材 */
    MATERIAL("/kcsapi/api_get_member/material"),
    /** 入渠ドック */
    NDOCK("/kcsapi/api_get_member/ndock"),
    /** アイテム一覧 */
    SLOTITEM_MEMBER("/kcsapi/api_get_member/slot_item"),
    /** 艦隊 */
    DECK("/kcsapi/api_get_member/deck"),
    /** 戦闘 */
    BATTLE("/kcsapi/api_req_sortie/battle"),
    /** 戦闘(夜戦) */
    BATTLE_MIDNIGHT("/kcsapi/api_req_battle_midnight/battle"),
    /** 戦闘(夜戦) */
    BATTLE_SP_MIDNIGHT("/kcsapi/api_req_battle_midnight/sp_midnight"),
    /** 戦闘(夜戦→昼戦) */
    BATTLE_NIGHT_TO_DAY("/kcsapi/api_req_sortie/night_to_day"),
    /** 戦闘結果 */
    BATTLE_RESULT("/kcsapi/api_req_sortie/battleresult"),
    /** 開発 */
    CREATE_ITEM("/kcsapi/api_req_kousyou/createitem"),
    /** 建造 */
    CREATE_SHIP("/kcsapi/api_req_kousyou/createship"),
    /** 建造ドック */
    KDOCK("/kcsapi/api_get_member/kdock"),
    /** 建造(入手) */
    GET_SHIP("/kcsapi/api_req_kousyou/getship"),
    /** 解体 */
    DESTROY_SHIP("/kcsapi/api_req_kousyou/destroyship"),
    /** 廃棄 */
    DESTROY_ITEM2("/kcsapi/api_req_kousyou/destroyitem2"),
    /** 近代化改修 */
    POWERUP("/kcsapi/api_req_kaisou/powerup"),
    /** 出撃 */
    START("kcsapi/api_req_map/start"),
    /** 進撃 */
    NEXT("/kcsapi/api_req_map/next"),
    /** 任務一覧 */
    QUEST_LIST("/kcsapi/api_get_member/questlist"),
    /** 任務消化 */
    QUEST_CLEAR("/kcsapi/api_req_quest/clearitemget"),
    /** 設定 */
    START2("/kcsapi/api_start2"),
    /** マップ情報 */
    MAPINFO("/kcsapi/api_get_member/mapinfo"),
    /** 任務情報 */
    MISSION("/kcsapi/api_get_member/mission"),
    /** 演習情報 */
    PRACTICE("/kcsapi/api_get_member/practice"),
    /** 戦闘 */
    PRACTICE_BATTLE("/kcsapi/api_req_practice/battle"),
    /** 戦闘(夜戦) */
    PRACTICE_BATTLE_MIDNIGHT("/kcsapi/api_req_practice/midnight_battle"),
    /** 戦闘結果 */
    PRACTICE_BATTLE_RESULT("/kcsapi/api_req_practice/battle_result"),
    /** 連合艦隊操作 */
    COMBINED("/kcsapi/api_req_hensei/combined"),
    /** フィルタ前のデータ */
    UNDEFINED(null);

    private final String url;

    private DataType(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}