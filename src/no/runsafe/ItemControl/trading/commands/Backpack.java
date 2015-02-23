package no.runsafe.ItemControl.trading;
 
import no.runsafe.ItemControl.trading.TradingHandler;
import no.runsafe.ItemControl.trading.TradingRepository;
import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.IServer;
import no.runsafe.framework.api.database.*;
import no.runsafe.framework.minecraft.inventory.RunsafeInventory;
import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
 
public class ShowBackpack extends PlayerCommand
{
	public ShowBackpack(TradingHandler handler)
	{
		super("create", "Open a backpack", "runsafe.backpack.open");
		RunsafeInventory inventory = server.createInventory(null, 27);
		this.handler = handler;
	}
 
	private final TradingHandler handler;
}
