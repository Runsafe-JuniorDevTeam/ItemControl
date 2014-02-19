package no.runsafe.ItemControl;

import no.runsafe.ItemControl.enchant_container.EnchantContainerHandler;
import no.runsafe.ItemControl.spawners.SpawnerHandler;
import no.runsafe.ItemControl.spawners.SpawnerMonitor;
import no.runsafe.ItemControl.trading.*;
import no.runsafe.ItemControl.trading.commands.CreateTrader;
import no.runsafe.ItemControl.trading.commands.EditMonitor;
import no.runsafe.ItemControl.trading.commands.EditTrader;
import no.runsafe.framework.RunsafeConfigurablePlugin;
import no.runsafe.framework.api.command.Command;
import no.runsafe.framework.features.Commands;
import no.runsafe.framework.features.Database;
import no.runsafe.framework.features.Events;

public class ItemControl extends RunsafeConfigurablePlugin
{
	@Override
	protected void pluginSetup()
	{
		addComponent(Events.class);
		addComponent(Commands.class);
		addComponent(Database.class);

		// Core functions
		addComponent(Globals.class);
		addComponent(PlayerListener.class);
		addComponent(BlockListener.class);

		// XP bottle handling
		addComponent(EnchantContainerHandler.class);

		// Mob spawners
		addComponent(SpawnerHandler.class);
		addComponent(SpawnerMonitor.class);

		// Merchants
		addComponent(TradingRepository.class);
		addComponent(TradingHandler.class);

		addComponent(EditMonitor.class);
		//addComponent(InventoryMonitor.class);

		Command traderCommand = new Command("traders", "Trader related commands", null);
		addComponent(traderCommand);

		traderCommand.addSubCommand(getInstance(CreateTrader.class));
		traderCommand.addSubCommand(getInstance(EditTrader.class));
	}
}
