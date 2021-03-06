package com.cellsgame.game.cmd.chat;

import java.util.Map;

import com.cellsgame.common.util.GameUtil;
import com.cellsgame.game.core.message.CMD;
import com.cellsgame.game.module.func.FuncParam;
import com.cellsgame.game.module.func.cons.SyncFuncType;
import com.cellsgame.game.module.player.vo.PlayerVO;

/**
 * @author Aly on  2016-09-12.
 */
public class AddGoods extends AChatCMD {
    @Override
    public Object getName() {
        return "addg";
    }

    @Override
    public Map execute(PlayerVO src, CMD cmd, String command, String[] parm) throws Exception {
        Map info = GameUtil.createSimpleMap();
        SyncFuncType.ChangeGoods.getFunc().checkAndExec(info, cmd, src, new FuncParam(Integer.parseInt(parm[1]), Integer.parseInt(parm[2])));
        return info;
    }
}
