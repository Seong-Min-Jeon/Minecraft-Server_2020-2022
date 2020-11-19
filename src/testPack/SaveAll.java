package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SaveAll {

	public SaveAll(Player player, File folder) {
		World world = player.getWorld();
		// 캐릭터 가방 저장
		try {
			File dataFolder = folder;
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			} else {
				String dataName = null;
				if (player.getInventory().contains(Material.RED_DYE)) {
					dataName = "boneFighter";
				} else if (player.getInventory().contains(Material.GREEN_DYE)) {
					dataName = "knight";
				} else if (player.getInventory().contains(Material.LAPIS_LAZULI)) {
					dataName = "priest";
				} else if (player.getInventory().contains(Material.CYAN_DYE)) {
					dataName = "berserker1";
				} else if (player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
					dataName = "gambler";
				} else if (player.getInventory().contains(Material.GRAY_DYE)) {
					dataName = "devil";
				} else if (player.getInventory().contains(Material.PINK_DYE)) {
					dataName = "angel";
				} else if (player.getInventory().contains(Material.LIME_DYE)) {
					dataName = "agent";
				} else if (player.getInventory().contains(Material.YELLOW_DYE)) {
					dataName = "shadowKnight";
				} else if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
					dataName = "berserker2";
				} else if (player.getInventory().contains(Material.MAGENTA_DYE)) {
					dataName = "soldier";
				} else if (player.getInventory().contains(Material.ORANGE_DYE)) {
					dataName = "grimReaper";
				} else if (player.getInventory().contains(Material.BLUE_DYE)) {
					dataName = "akuma";
				} else if (player.getInventory().contains(Material.BROWN_DYE)) {
					dataName = "paladin";
				} else if (player.getInventory().contains(Material.BLACK_DYE)) {
					dataName = "dragonKnight";
				} else if (player.getInventory().contains(Material.INK_SAC)) {
					dataName = "commander";
				} else if (player.getInventory().contains(Material.CLAY_BALL)) {
					dataName = "archer";
				} else if (player.getInventory().contains(Material.GLOWSTONE_DUST)) {
					dataName = "powerRanger";
				}
				if (dataName != null) {
					File file = new File(folder, "playerInv.dat");
					if (!file.exists()) {
						try {
							file.createNewFile();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					FileReader filereader = new FileReader(file);
					BufferedReader bufReader = new BufferedReader(filereader);
					String line = bufReader.readLine();
					while (line != null) {
						if (line.equals(player.getUniqueId().toString())) {
							break;
						}
						line = bufReader.readLine();
					}
					if (line != null) {
						String loc = bufReader.readLine();
						String[] ary = loc.split("/");
						if (dataName.equals("boneFighter")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 0);
						} else if (dataName.equals("knight")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 1);
						} else if (dataName.equals("priest")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 2);
						} else if (dataName.equals("berserker1")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 3);
						} else if (dataName.equals("gambler")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 4);
						} else if (dataName.equals("devil")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 5);
						} else if (dataName.equals("angel")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 6);
						} else if (dataName.equals("agent")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 7);
						} else if (dataName.equals("shadowKnight")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 8);
						} else if (dataName.equals("berserker2")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 9);
						} else if (dataName.equals("soldier")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 10);
						} else if (dataName.equals("grimReaper")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 11);
						} else if (dataName.equals("akuma")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 12);
						} else if (dataName.equals("paladin")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 13);
						} else if (dataName.equals("dragonKnight")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 14);
						} else if (dataName.equals("commander")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 15);
						} else if (dataName.equals("archer")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 16);
						} else if (dataName.equals("powerRanger")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 17);
						}
						int x = Integer.parseInt(ary[0]);
						int y = Integer.parseInt(ary[1]);
						int z = Integer.parseInt(ary[2]);
						Block block1 = new Location(world, x, y, z).getBlock();
						Chest chest1 = (Chest) block1.getState();
						Inventory c1Inv = chest1.getInventory();
						Inventory pInv = player.getInventory();
						c1Inv.clear();
						for (int i = 0; i < 27; i++) {
							if (pInv.getItem(i) == null) {
								continue;
							}
							c1Inv.setItem(i, pInv.getItem(i));
						}
						Block block2 = new Location(world, x, y + 1, z).getBlock();
						Chest chest2 = (Chest) block2.getState();
						Inventory c2Inv = chest2.getInventory();
						c2Inv.clear();
						for (int i = 0; i < 14; i++) {
							if (pInv.getItem(i+27) == null) {
								continue;
							}
							c2Inv.setItem(i, pInv.getItem(i+27));
						}
						bufReader.close();
					}
				}
			}
		} catch (Exception e) {

		}
		// 캐릭터 데이터 저장
		try {
			File dataFolder = folder;
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			} else {
				String dataName = null;
				if (player.getInventory().contains(Material.RED_DYE)) {
					dataName = "boneFighter";
				} else if (player.getInventory().contains(Material.GREEN_DYE)) {
					dataName = "knight";
				} else if (player.getInventory().contains(Material.LAPIS_LAZULI)) {
					dataName = "priest";
				} else if (player.getInventory().contains(Material.CYAN_DYE)) {
					dataName = "berserker1";
				} else if (player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
					dataName = "gambler";
				} else if (player.getInventory().contains(Material.GRAY_DYE)) {
					dataName = "devil";
				} else if (player.getInventory().contains(Material.PINK_DYE)) {
					dataName = "angel";
				} else if (player.getInventory().contains(Material.LIME_DYE)) {
					dataName = "agent";
				} else if (player.getInventory().contains(Material.YELLOW_DYE)) {
					dataName = "shadowKnight";
				} else if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
					dataName = "berserker2";
				} else if (player.getInventory().contains(Material.MAGENTA_DYE)) {
					dataName = "soldier";
				} else if (player.getInventory().contains(Material.ORANGE_DYE)) {
					dataName = "grimReaper";
				} else if (player.getInventory().contains(Material.BLUE_DYE)) {
					dataName = "akuma";
				} else if (player.getInventory().contains(Material.BROWN_DYE)) {
					dataName = "paladin";
				} else if (player.getInventory().contains(Material.BLACK_DYE)) {
					dataName = "dragonKnight";
				} else if (player.getInventory().contains(Material.INK_SAC)) {
					dataName = "commander";
				} else if (player.getInventory().contains(Material.CLAY_BALL)) {
					dataName = "archer";
				} else if (player.getInventory().contains(Material.GLOWSTONE_DUST)) {
					dataName = "powerRanger";
				}
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
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					FileReader filereader = new FileReader(file);
					BufferedReader bufReader = new BufferedReader(filereader);
					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
					fw.write((int) (player.getLocation().getX()) + "/" + (int) (player.getLocation().getY()) + "/"
							+ (int) (player.getLocation().getZ()));
					fw.write("\n");
					fw.write((int) player.getHealth() + "/" + (int) player.getFoodLevel());
					fw.write("\n");
					fw.write((int) player.getLevel() + "/" + player.getExp());
					fw.close();
					bufReader.close();
				}
			}
		} catch (Exception e) {

		}
		// 퀘스트 저장
		try {
			File dataFolder = folder;
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			} else {
				String dataName = null;
				if (player.getInventory().contains(Material.RED_DYE)) {
					dataName = "boneFighter";
				} else if (player.getInventory().contains(Material.GREEN_DYE)) {
					dataName = "knight";
				} else if (player.getInventory().contains(Material.LAPIS_LAZULI)) {
					dataName = "priest";
				} else if (player.getInventory().contains(Material.CYAN_DYE)) {
					dataName = "berserker1";
				} else if (player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
					dataName = "gambler";
				} else if (player.getInventory().contains(Material.GRAY_DYE)) {
					dataName = "devil";
				} else if (player.getInventory().contains(Material.PINK_DYE)) {
					dataName = "angel";
				} else if (player.getInventory().contains(Material.LIME_DYE)) {
					dataName = "agent";
				} else if (player.getInventory().contains(Material.YELLOW_DYE)) {
					dataName = "shadowKnight";
				} else if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
					dataName = "berserker2";
				} else if (player.getInventory().contains(Material.MAGENTA_DYE)) {
					dataName = "soldier";
				} else if (player.getInventory().contains(Material.ORANGE_DYE)) {
					dataName = "grimReaper";
				} else if (player.getInventory().contains(Material.BLUE_DYE)) {
					dataName = "akuma";
				} else if (player.getInventory().contains(Material.BROWN_DYE)) {
					dataName = "paladin";
				} else if (player.getInventory().contains(Material.BLACK_DYE)) {
					dataName = "dragonKnight";
				} else if (player.getInventory().contains(Material.INK_SAC)) {
					dataName = "commander";
				} else if (player.getInventory().contains(Material.CLAY_BALL)) {
					dataName = "archer";
				} else if (player.getInventory().contains(Material.GLOWSTONE_DUST)) {
					dataName = "powerRanger";
				}
				File dir = new File(folder + "/" + player.getUniqueId().toString());
				if (!dir.exists()) {
					try {
						dir.mkdir();
					} catch (Exception e) {
						e.getStackTrace();
					}
				}
				if (dataName != null) {
					File file = new File(dir, dataName + "_Qdata.dat");
					if (!file.exists()) {
						try {
							file.createNewFile();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					FileReader filereader = new FileReader(file);
					BufferedReader bufReader = new BufferedReader(filereader);
					FileWriter fw = new FileWriter(file, false);
					QuestBoard qb = new QuestBoard();
					if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===해안의 위협===")) {
						int number = qb.getNum(player);
						fw.write("q1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===해적선의 보물===")) {
						int number = qb.getNum(player);
						fw.write("q2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 말단===")) {
						int number = qb.getNum(player);
						fw.write("q3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===밀 사냥꾼===")) {
						int number = qb.getNum(player);
						fw.write("q4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===침략자===")) {
						int number = qb.getNum(player);
						fw.write("q5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===숲 깊은 곳===")) {
						int number = qb.getNum(player);
						fw.write("q6\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===유적을 정화하는 자===")) {
						int number = qb.getNum(player);
						fw.write("q7\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===같아보이지만 다른===")) {
						int number = qb.getNum(player);
						fw.write("q8\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 위협===")) {
						int number = qb.getNum(player);
						fw.write("q9\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
						int number = qb.getNum(player);
						fw.write("q10\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네크로벨리===")) {
						int number = qb.getNum(player);
						fw.write("q11\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===데빌 인자===")) {
						int number = qb.getNum(player);
						fw.write("q12\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 고블린===")) {
						int number = qb.getNum(player);
						fw.write("q13\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===불의 악마===")) {
						int number = qb.getNum(player);
						fw.write("q14\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===방해받은 파괴수의 잠I===")) {
						int number = qb.getNum(player);
						fw.write("q15\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===묘지를 지키는 자===")) {
						int number = qb.getNum(player);
						fw.write("q16\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===폭탄병===")) {
						int number = qb.getNum(player);
						fw.write("q17\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===에밀의 결의===")) {
						int number = qb.getNum(player);
						fw.write("q18\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희1===")) {
						int number = qb.getNum(player);
						fw.write("eq1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희2===")) {
						int number = qb.getNum(player);
						fw.write("eq1_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희3===")) {
						int number = qb.getNum(player);
						fw.write("eq1_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희4===")) {
						int number = qb.getNum(player);
						fw.write("eq1_3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희5===")) {
						int number = qb.getNum(player);
						fw.write("eq1_4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희6===")) {
						int number = qb.getNum(player);
						fw.write("eq1_5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희7===")) {
						int number = qb.getNum(player);
						fw.write("eq1_6\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마신왕의 계약1===")) {
						int number = qb.getNum(player);
						fw.write("eq2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마신왕의 계약2===")) {
						int number = qb.getNum(player);
						fw.write("eq2_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마신왕의 계약3===")) {
						int number = qb.getNum(player);
						fw.write("eq2_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===워그닐 섬의 비밀===")) {
						int number = qb.getNum(player);
						fw.write("mq1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===수련의 시작===")) {
						int number = qb.getNum(player);
						fw.write("mq2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===에일 땅으로===")) {
						int number = qb.getNum(player);
						fw.write("mq3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===촌장의 부탁1===")) {
						int number = qb.getNum(player);
						fw.write("mq4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===촌장의 부탁2===")) {
						int number = qb.getNum(player);
						fw.write("mq5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===촌장의 부탁3===")) {
						int number = qb.getNum(player);
						fw.write("mq6\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===전설의 시작===")) {
						int number = qb.getNum(player);
						fw.write("mq7\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===파르홀론의 역사===")) {
						int number = qb.getNum(player);
						fw.write("mq8\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===앞으로 나아가기 위한 여정===")) {
						int number = qb.getNum(player);
						fw.write("mq9\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===등대지기 시험===")) {
						int number = qb.getNum(player);
						fw.write("mq10\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===등대에 숨겨진 비밀===")) {
						int number = qb.getNum(player);
						fw.write("mq11\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===등대를 밝히는 힘===")) {
						int number = qb.getNum(player);
						fw.write("mq12\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===시드 광산으로 가는 길===")) {
						int number = qb.getNum(player);
						fw.write("mq13\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===시드 광산===")) {
						int number = qb.getNum(player);
						fw.write("mq14\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 무기1===")) {
						int number = qb.getNum(player);
						fw.write("mq15\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 무기2===")) {
						int number = qb.getNum(player);
						fw.write("mq15_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미푀르유 성===")) {
						int number = qb.getNum(player);
						fw.write("mq16\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
						int number = qb.getNum(player);
						fw.write("mq17\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자1===")) {
						int number = qb.getNum(player);
						fw.write("mq18\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자2===")) {
						int number = qb.getNum(player);
						fw.write("mq19\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자3===")) {
						int number = qb.getNum(player);
						fw.write("mq20\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자4===")) {
						int number = qb.getNum(player);
						fw.write("mq20_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자5===")) {
						int number = qb.getNum(player);
						fw.write("mq20_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자6===")) {
						int number = qb.getNum(player);
						fw.write("mq21\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===아란모어===")) {
						int number = qb.getNum(player);
						fw.write("mq22\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===던전 탐색===")) {
						int number = qb.getNum(player);
						fw.write("mq23\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===카루 던전===")) {
						int number = qb.getNum(player);
						fw.write("mq24\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 보물1===")) {
						int number = qb.getNum(player);
						fw.write("mq25\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 보물2===")) {
						int number = qb.getNum(player);
						fw.write("mq26\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 보물3===")) {
						int number = qb.getNum(player);
						fw.write("mq26_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 만남===")) {
						int number = qb.getNum(player);
						fw.write("mq27\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===늪지의 마신왕===")) {
						int number = qb.getNum(player);
						fw.write("mq28\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽음의 탑1===")) {
						int number = qb.getNum(player);
						fw.write("mq29\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽음의 탑2===")) {
						int number = qb.getNum(player);
						fw.write("mq29_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===되살아난 해골===")) {
						int number = qb.getNum(player);
						fw.write("mq30\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===영혼 요정 가루===")) {
						int number = qb.getNum(player);
						fw.write("mq31\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===너의 근육을 먹고 싶어===")) {
						int number = qb.getNum(player);
						fw.write("mq32\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===그대는 빨간모자===")) {
						int number = qb.getNum(player);
						fw.write("mq33\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기1===")) {
						int number = qb.getNum(player);
						fw.write("mq33_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===또다시 빨간모자===")) {
						int number = qb.getNum(player);
						fw.write("mq34\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기2===")) {
						int number = qb.getNum(player);
						fw.write("mq34_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마법탑을 향해===")) {
						int number = qb.getNum(player);
						fw.write("mq35\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 마나===")) {
						int number = qb.getNum(player);
						fw.write("mq35_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===이것이 포보르 왕?===")) {
						int number = qb.getNum(player);
						fw.write("mq36\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===누가 우는 소리를 내었는가===")) {
						int number = qb.getNum(player);
						fw.write("mq37\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===떠도는 망령===")) {
						int number = qb.getNum(player);
						fw.write("mq37_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===아이 달래기===")) {
						int number = qb.getNum(player);
						fw.write("mq37_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===누가 또 우는 소리를 내었는가===")) {
						int number = qb.getNum(player);
						fw.write("mq38\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===수상한 몬스터===")) {
						int number = qb.getNum(player);
						fw.write("mq38_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===아이에게 보답을===")) {
						int number = qb.getNum(player);
						fw.write("mq38_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네비의 힘1===")) {
						int number = qb.getNum(player);
						fw.write("mq39\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네비의 힘2===")) {
						int number = qb.getNum(player);
						fw.write("mq39_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네비의 힘3===")) {
						int number = qb.getNum(player);
						fw.write("mq39_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===아라크네의 저주===")) {
						int number = qb.getNum(player);
						fw.write("mq40\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 흐름의 힘===")) {
						int number = qb.getNum(player);
						fw.write("mq41\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===흐름의 봉인을 위해===")) {
						int number = qb.getNum(player);
						fw.write("mq41_1\n");
						fw.write(Integer.toString(number));
					}
					fw.close();
					bufReader.close();
				}
			}
		} catch (Exception e) {

		}
	}
	
}
