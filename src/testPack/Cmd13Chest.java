package testPack;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd13Chest implements CommandExecutor {
	
	private static HashMap<String, Integer> userAL = new HashMap<>();
	private static HashMap<String, Integer> selectAL = new HashMap<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			String uuid = player.getUniqueId().toString();
		
			if(cmd.getName().equalsIgnoreCase("chest")) {
				if(args.length == 0) {
					player.sendMessage(ChatColor.WHITE + "chest 1 / chest 2 등으로 열 수 있는 은행 상자를 선택할 수 있습니다. chest 1은 기본 상자입니다.");
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("1")) {
						player.sendMessage(ChatColor.GREEN + "You can open chest 1");
						putSelectAL(uuid, 1);
						return true;
					} else if(args[0].equalsIgnoreCase("2")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 2) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 2");
							putSelectAL(uuid, 2);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("3")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 3) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 3");
							putSelectAL(uuid, 3);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("4")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 4) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 4");
							putSelectAL(uuid, 4);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("5")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 5) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 5");
							putSelectAL(uuid, 5);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("6")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 6) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 6");
							putSelectAL(uuid, 6);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("7")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 7) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 7");
							putSelectAL(uuid, 7);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("8")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 8) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 8");
							putSelectAL(uuid, 8);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("9")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 9) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 9");
							putSelectAL(uuid, 9);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("10")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 10) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 10");
							putSelectAL(uuid, 10);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("11")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 11) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 11");
							putSelectAL(uuid, 11);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("12")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 12) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 12");
							putSelectAL(uuid, 12);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("13")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 13) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 13");
							putSelectAL(uuid, 13);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("14")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 14) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 14");
							putSelectAL(uuid, 14);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("15")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 15) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 15");
							putSelectAL(uuid, 15);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("16")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 16) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 16");
							putSelectAL(uuid, 16);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("17")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 17) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 17");
							putSelectAL(uuid, 17);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("18")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 18) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 18");
							putSelectAL(uuid, 18);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("19")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 19) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 19");
							putSelectAL(uuid, 19);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("20")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 20) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 20");
							putSelectAL(uuid, 20);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("21")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 21) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 21");
							putSelectAL(uuid, 21);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("22")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 22) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 22");
							putSelectAL(uuid, 22);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("23")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 23) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 23");
							putSelectAL(uuid, 23);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("24")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 24) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 24");
							putSelectAL(uuid, 24);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("25")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 25) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 25");
							putSelectAL(uuid, 25);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("26")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 26) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 26");
							putSelectAL(uuid, 26);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("27")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 27) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 27");
							putSelectAL(uuid, 27);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("28")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 28) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 28");
							putSelectAL(uuid, 28);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("29")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 29) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 29");
							putSelectAL(uuid, 29);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("30")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 30) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 30");
							putSelectAL(uuid, 30);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else {
						player.sendMessage(ChatColor.RED + "Wrong Input!");
						return true;
					}
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "Wrong Input!");
					return true;
				}
			}
		}	
		return true;
	}

	public void putData(String uuid, Integer num) {
		userAL.put(uuid, num);
	}
	
	public void putSelectAL(String uuid, Integer num) {
		if(selectAL.containsKey(uuid)) {
			selectAL.remove(uuid);
		}
		selectAL.put(uuid, num);
	}
	
	public boolean isPlayerInSelectAL(String uuid) {
		if(selectAL.containsKey(uuid)) {
			return true;
		}
		return false;
	}
	
	public Integer getChestNum(String uuid) {
		if(selectAL.containsKey(uuid)) {
			return selectAL.get(uuid);
		} else {
			return 1;
		}
		
	}
}
