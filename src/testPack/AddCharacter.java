package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class AddCharacter{
	
	public AddCharacter(Player player, String job, File folder) {
		// 이미 있는 직업인지 검사
		int[] ary = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};;
		try {
			File dataFolder = folder;
			if(!dataFolder.exists()) {
                dataFolder.mkdir();
            }
			File dir = new File(folder + "/" + player.getUniqueId().toString());
        	if(!dir.exists()) {
        		try{
        		    dir.mkdir(); 
        		} catch(Exception e) {
        		    e.getStackTrace();
        		}
        	}
        	File[] files = dir.listFiles();
        	for(File f : files) {
        		if(f.getName().equals("boneFighter_data.dat")) {
        			ary[0] = 1;
        		} else if(f.getName().equals("knight_data.dat")) {
        			ary[1] = 1;
        		} else if(f.getName().equals("priest_data.dat")) {
        			ary[2] = 1;
        		} else if(f.getName().equals("berserker1_data.dat")) {
        			ary[3] = 1;
        		} else if(f.getName().equals("gambler_data.dat")) {
        			ary[4] = 1;
        		} else if(f.getName().equals("devil_data.dat")) {
        			ary[10] = 1;
        		} else if(f.getName().equals("angel_data.dat")) {
        			ary[11] = 1;
        		} else if(f.getName().equals("agent_data.dat")) {
        			ary[12] = 1;
        		} else if(f.getName().equals("shadowKnight_data.dat")) {
        			ary[5] = 1;
        		} else if(f.getName().equals("berserker2_data.dat")) {
        			ary[6] = 1;
        		} else if(f.getName().equals("soldier_data.dat")) {
        			ary[7] = 1;
        		} else if(f.getName().equals("grimReaper_data.dat")) {
        			ary[8] = 1;
        		} else if(f.getName().equals("akuma_data.dat")) {
        			ary[13] = 1;
        		} else if(f.getName().equals("paladin_data.dat")) {
        			ary[14] = 1;
        		} else if(f.getName().equals("dragonKnight_data.dat")) {
        			ary[15] = 1;
        		} else if(f.getName().equals("commander_data.dat")) {
        			ary[16] = 1;
        		} else if(f.getName().equals("archer_data.dat")) {
        			ary[9] = 1;
        		} else if(f.getName().equals("powerRanger_data.dat")) {
        			ary[17] = 1;
        		}
        	}
		} catch(Exception e) {
			
		}
		if(job.equals("boneFighter") && ary[0] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("knight") && ary[1] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("priest") && ary[2] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("berserker1") && ary[3] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("gambler") && ary[4] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("devil") && ary[10] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("angel") && ary[11] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("agent") && ary[12] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("shadowKnight") && ary[5] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("berserker2") && ary[6] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("soldier") && ary[7] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("grimReaper") && ary[8] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("akuma") && ary[13] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("paladin") && ary[14] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("dragonKnight") && ary[15] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("commander") && ary[16] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("archer") && ary[9] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		} else if(job.equals("powerRanger") && ary[17] == 1) {
			player.sendMessage(ChatColor.BOLD + "이미 존재하는 직업입니다.");
			return;
		}
		
		// 캐릭터 데이터 생성
		try {
			File dataFolder = folder;
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			} else {
				String dataName = job;
				File dir = new File(folder + "/" + player.getUniqueId().toString());
				if (!dir.exists()) {
					try {
						dir.mkdir();
					} catch (Exception e) {
						e.getStackTrace();
					}
				}
				if (dataName != null) {
					File file = new File(dir, dataName + "_data.dat");
					if (!file.exists()) {
						try {
							file.createNewFile();
							FileReader filereader = new FileReader(file);
							BufferedReader bufReader = new BufferedReader(filereader);
							BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
							fw.write("3697/42/3679");
							fw.write("\n");
							fw.write("20/20");
							fw.write("\n");
							fw.write("0/0");
							fw.close();
							bufReader.close();
							player.closeInventory();
							new CharacterSelectButton(player, folder);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		} catch (Exception e) {

		}
	}
	
}
