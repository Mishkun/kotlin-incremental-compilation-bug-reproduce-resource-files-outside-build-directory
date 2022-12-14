package io.github.mishkun.myapplication

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import io.github.mishkun.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
        val id = listOf(
R.string.a9ca90480_cc05_4665_b7b1_b88ca34c6fe3,
R.string.a519f1e45_2f0d_46b4_a98b_d3263c98c6ce,
R.string.a8a871742_9adb_41ab_9126_7c66869d2947,
R.string.d0236a3d_c981_42df_970e_d38d7a2d23ba,
R.string.a2217bec5_e4ef_490f_bbbe_384ec8b028e2,
R.string.a399f7c07_c4c1_4438_a22d_5e6361203875,
R.string.a5cf6a0b8_5926_453f_bd38_c7a0929ee8f6,
R.string.a969013e4_1f63_4d12_9843_cf39efbf1f4b,
R.string.e2c16e66_a697_47fc_a0ea_5806fa364db7,
R.string.a7bbe32a3_d75b_4b9b_9d34_4e7b4ccb90d9,
R.string.a61e3bcb7_54be_4e6a_a088_4bdab98d088f,
R.string.a9368b40b_4a70_498b_bc40_017fd05f06c5,
R.string.a82d29067_c90e_465b_bb0e_2e8f1047e077,
R.string.a16ae6125_2906_4cb3_a4fc_d73bcbb3900e,
R.string.a55edc6b_0c11_4d71_a111_d5b5aa071ff3,
R.string.a7a76cabd_883d_4da8_8d2e_9876f09b70f3,
R.string.a71bd9ec6_039d_497b_859b_68d49fa7392d,
R.string.ea2dff26_95cc_4b68_99fa_28102b2b1099,
R.string.a88f09bd7_4f5a_489d_a9dd_66664d89f8e5,
R.string.f6a09de3_e82a_4e62_a8e2_a798dcb47412,
R.string.a9c82d32f_3296_4516_b513_d468b0f1229c,
R.string.a98ea274a_243b_4e1c_94d0_c16138dae742,
R.string.a7f86ae74_5ab8_46b3_aef2_fc8032771756,
R.string.efe516ad_9fd3_4fbc_8af4_949b2a4f598b,
R.string.dc13770f_3c5a_4ede_b51c_c12b540d3d60,
R.string.a9c9045f7_7d4b_4399_ac6e_54dd6a157506,
R.string.d3b59df5_e132_41f4_9144_236dccb65240,
R.string.a82d8638_91d9_4f64_a6a9_2ec454d56b10,
R.string.e4336558_a7e0_47f6_b0f1_d5ec37d131f1,
R.string.a9a5dadb9_eb70_4f4c_825c_a0563b516526,
R.string.a4a3e3652_2e36_4d9e_93f8_297ad65cb50a,
R.string.a41f922d6_8d22_4419_a4ff_0c41e5361212,
R.string.f0c97650_6419_47a9_8a4a_ab1bc0f00b18,
R.string.ba3fa868_26a8_40c9_bf0b_e721d874af11,
R.string.df844d97_703b_4998_8be7_6dcd10654a3d,
R.string.a545f414b_46cf_408f_9ae0_b791ecc27cbd,
R.string.dff878d5_cccd_43a6_a7bf_127573e703bb,
R.string.a797dd20a_8832_4604_b33a_f548d07cd50e,
R.string.cc328afc_ff4c_4f72_a8c6_ab0851b2e179,
R.string.a8d93e7b1_370a_4ce5_8151_6c4e9afd1b01,
R.string.a233ad601_865e_4cee_8cd7_cc815c1f2f25,
R.string.a52ae0784_e26b_49a8_acf1_24605fbf9ca7,
R.string.dd498d50_e678_4fe8_8dd4_a384e61921c0,
R.string.a9719b6e0_c770_4720_ae89_aaf4c43d33c4,
R.string.a90a5c90_037f_42b3_be03_3e727633f75a,
R.string.a78da3078_26a4_462a_acd8_0c1a412f2768,
R.string.a2bbe91a7_58db_45a7_aa13_f259db93286b,
R.string.a060656b2_c88a_47d9_9f7d_b395f6bc70b6,
R.string.a1d6c852a_bc78_4f69_932c_5c9a466f7cd9,
R.string.a98f7540d_8821_48df_9c2c_7568e1d0c162,
R.string.a0ffe7e62_f482_497c_95d1_753fa4f871ee,
R.string.e26f15f0_21e1_4074_a5ce_25a3b15fc531,
R.string.ae467056_f8d9_44e9_90ca_3e091199421d,
R.string.e0c25e7e_357d_4e45_92e7_92b717dd8759,
R.string.a23a6686e_dd3d_43a4_8b78_8420cdc5dcb8,
R.string.a2528c920_1700_4d86_8fd6_257c7845bf39,
R.string.a40d08595_2902_43bf_8631_482890150d89,
R.string.d5d06e4f_6faf_409b_b32b_eb18c19a66ba,
R.string.a73200c4d_56eb_4149_85d3_98ff9f8ccbeb,
R.string.a08f05b02_2058_40b0_9274_accde71d2426,
R.string.d33595f7_acfd_4d4a_9624_c6f8a91669b9,
R.string.b7a7aa7b_028d_4087_88ee_77fe63ed94da,
R.string.db950214_3433_41a7_a925_640eb5495da2,
R.string.a6edb9321_17fd_48e4_b74e_f59030db2f7c,
R.string.a06103e22_5482_43c3_8eab_c59389562608,
R.string.a644590d1_9c66_46b2_89c9_133827bf9e17,
R.string.fa719f92_671b_493b_ac67_7c5f86906373,
R.string.a87a89c68_c83e_4bca_9041_d77f6014b3e0,
R.string.a462dfad8_ad1c_434c_945c_6c19215a1873,
R.string.cd481483_6122_4b41_be11_645dde2f48c2,
R.string.ab217864_53df_4158_8be3_1d9077f25871,
R.string.a141d2090_0ab2_423c_881a_4b45d22c6742,
R.string.f5f6f314_4a51_498c_a888_71250ca50e1d,
R.string.a21f058e7_ca0e_4db6_b43f_6128dc234086,
R.string.a1e16e13f_2c76_48a4_be07_ddb0dbb74fa7,
R.string.fb5818d1_b6dd_4f45_9d01_e9400d8ead0a,
R.string.a7822e088_eb25_4208_b54f_25dfcdc62f3c,
R.string.a5dce0fcd_4ae2_48b2_9e3c_b77add1bcad6,
R.string.a98127435_9f2f_496f_b86f_f2e9085104d1,
R.string.a9c8b3405_1b8c_4577_baea_7aeaa9081896,
R.string.a16e6f8f_41b4_4943_bed0_512f6172900d,
R.string.a28f78b5f_45cb_4623_b9bb_75762e64f055,
R.string.b68eb549_d27b_44c5_9a87_528ecb7a3176,
R.string.a681ba11c_87ac_430f_bcb3_9db66f35a8e5,
R.string.a4a414068_6e6f_431e_a2b1_f836cc78839b,
R.string.a11fd8100_c74b_418b_8d60_150dd9f92bfa,
R.string.a03277d7b_a17b_407f_b251_1808547c356e,
R.string.aba785f9_0296_4f83_a241_f8139ead3219,
R.string.a37dd3929_a631_434e_936b_374330f10709,
R.string.f24257e0_ea1d_45bf_8abd_14447cf9e6e4,
R.string.d95be045_9481_4dcf_a7a3_aa23e485d283,
R.string.fad19763_e92a_4b48_a82b_363517716bbd,
R.string.b9fccb17_8c71_4af6_a62c_133a58d8048c,
R.string.cd42ccf5_6b2d_4516_b3a0_c391e461ca47,
R.string.ba8f5128_8346_4678_83e3_be3117454de9,
R.string.a25bac6b9_5476_4d88_b249_7eca9c736c20,
R.string.e79763d8_edb4_49a9_b7ec_11d27c5c5b15,
R.string.a1f980073_e976_437a_8793_f7374c1ecb36,
R.string.da31c53a_d89d_4c03_8f47_b1f92f66068c,
R.string.e76b554d_fc23_4b68_b4f0_bfe7cd3704b4,
R.string.d157356d_8611_45c2_bfa7_90a1561b25cd,
R.string.a4a1dd3d9_82ff_4afd_bb74_9c68e9231b97,
R.string.a842cae6f_26c5_485e_8628_839123e605b6,
R.string.df8a464f_61d7_463d_9e38_812011110754,
R.string.a100ccf59_a543_4217_99d6_97b4d6753de9,
R.string.f9746d36_1f4b_41f1_8949_0591f45063e1,
R.string.b1f86ebc_5261_479b_b062_92f11d803377,
R.string.a74c2a5ae_b768_4aec_9363_21ac41417820,
R.string.a631ec2bb_5bec_40a6_995b_295d60c332ca,
R.string.aa971c81_30c3_44ae_b8a2_269bf1edc75c,
R.string.a547cf930_168d_4494_986f_f0ecaba4a46c,
R.string.a15d274e7_f20b_447c_bbe1_1db16ac6d52e,
R.string.bfee0ba1_9d2e_4aaf_95ee_78b0ea6e5038,
R.string.b2a3d19e_da44_4dcc_bfb1_669371f45cc7,
R.string.a998fc84e_1067_4882_a155_768448abd493,
R.string.a809472a1_4229_48ec_a12d_c15b09dc3477,
R.string.a7da4c4f4_9c0b_4919_819c_d443c4ab7246,
R.string.a4843d5a2_f40f_4d76_a6ef_f0621c1e1df0,
R.string.d52e377f_ae81_4eaa_b3e7_0b06c279cc49,
R.string.a5e2fcd95_212d_4fc9_b607_674a1a34caef,
R.string.e743ed27_ef23_427a_af62_bac86540811e,
R.string.a202ba1b9_2c48_4e25_8284_6d68f1b3c73c,
R.string.a641f6fb6_ea10_4a15_aee5_02bd32aaeda6,
R.string.a1abf7754_6f02_4a7c_8b6a_7f3ea36ec3de,
R.string.a3aa07501_fab5_48a5_a5a9_856348122ec5,
R.string.a02dcbd92_4876_4b85_9ccf_6e1b0f6019df,
R.string.a7ace12ed_e32d_4658_b384_a7634c5875cc,
R.string.a6ec21562_c3f9_4e0a_92e1_babd1e465950,
R.string.a0e042bce_b76e_4376_a248_8f1dafd7be51,
R.string.a6b2737e4_78c3_4472_9290_d76efca0418e,
R.string.fccc9c21_82a4_42be_ae9a_33e01d782ae9,
R.string.caefb0ac_53c6_4c0e_bd39_d71dfd1bdd97,
R.string.a28ecb0f3_7932_426f_b5f5_a7e077bd51f1,
R.string.d7155187_d5eb_4c29_ac39_12dfa74cfcf7,
R.string.a81556a66_9833_4b0b_b953_94a35c8fe2e9,
R.string.e20f8dc1_6e55_4da1_be8d_e85b9429ce4f,
R.string.a95c1af29_f021_416b_a584_caa9ca653ebc,
R.string.a6b305593_b508_4120_a859_b7b5c072c3ff,
R.string.a747998cb_04d8_4e82_bcad_a967fc7f09b8,
R.string.a058211f_c327_4b05_98fb_6a371d40a36e,
R.string.a39dd55cd_5ddc_411b_92b4_fa4aeeaee221,
R.string.d3ce4349_eeac_4188_90d4_1c54ff816a4d,
R.string.a118e623b_d68e_478c_ae87_ce8214162476,
R.string.a212991e4_b816_4c56_ba93_730641e14f0f,
R.string.a714c66ca_35fb_40a0_8c9a_854085eee6e5,
R.string.df6ffc8f_f0df_4db4_b4a9_cdfc0bc5160f,
R.string.a040667b0_22e0_49cd_9c5e_482ae1bcbda7,
R.string.a0aa37b1b_8837_41dd_9545_80154af77ff9,
R.string.a6ac209de_b56a_4917_a64a_6c21dd42ea2e,
R.string.cff8f4de_dcc4_4e7e_a7a6_ed014af7e672,
R.string.f872518d_614a_4c3f_b330_9f4e7b2386d3,
R.string.fb671f79_d18c_4eb2_b868_fe1d599f8640,
R.string.a08d2549e_5e15_4490_bb94_27c8cde6a4c7,
R.string.eb0048d4_2d18_4fd5_bd1c_5eb7f65fa69b,
R.string.a8b65f2a9_33d3_4d04_86cf_0b4c9cb815cf,
R.string.a94750522_b3a1_4673_b05a_a1bb482fb001,
R.string.a48ae3dc3_b1c4_4d2c_92e7_be1106e69e77,
R.string.a5a5e04bf_8133_4074_a371_32654c1645a7,
R.string.ffad4374_e0cb_4d4f_9d56_5dc9103175c3,
R.string.c01b4ad8_bef8_4f4f_8636_0634183414f0,
R.string.b5bf596e_2f8c_4c55_888b_2def4461274f,
R.string.f4ac54d8_9370_4fc9_9abf_a57244da7927,
R.string.a2a6d28c_a16e_42be_80da_71d785f6d93c,
R.string.a2940660f_fb3e_4173_95d6_846f5d76ab2e,
R.string.e3fa22f7_8581_46bc_bf1f_83ecf5cef4a3,
R.string.a482700fa_f539_4b92_8d80_2b6bb67c4334,
R.string.a6e7fcb8d_3e2e_4c85_8f38_3729904c00a1,
R.string.a5f6dc97e_63c5_4def_b9cd_b2016c3abf6d,
R.string.d33d89f6_a02d_4a1f_bacc_8b90c3f1798d,
R.string.ff7d40cc_6e03_47c5_a046_67c9a12a0d09,
R.string.e6fe0de0_946a_4790_af7e_98fc71606830,
R.string.a91fa5eee_2b5c_49c0_b64b_79cae6e8e56e,
R.string.a4b62e5a4_a47b_4026_be69_2619418162f6,
R.string.a7fe919a9_c1df_43e7_9888_8be30dab68ff,
R.string.a77741680_0795_4060_a18b_108bc17048e6,
R.string.a9c97416c_4335_47a0_b2bb_36420e986570,
R.string.a0bdefcde_21fb_4ff8_9e6e_ad7238d92e85,
R.string.a97eff650_6668_44da_b6dd_ff55ac51bbbe,
R.string.a416885ce_2959_49b4_b5d7_ed6b8e5384fd,
R.string.c1ca908c_bd1e_421d_a011_d162f86d63eb,
R.string.a607e6d02_0f2e_4cf2_90ee_ad8d83ed759e,
R.string.a8afa514f_2bbd_449f_8c25_c32e5bb9c322,
R.string.a9ef35b37_ef4a_4b7c_bb6a_0aec2767fb76,
R.string.a6abac87c_48e3_4159_bf4e_b8f065cb300a,
R.string.a5faec1d4_d992_4bc0_a2c4_cac80ec15c5a,
R.string.a4af38c2b_8343_482e_b837_fe6eb0b5b794,
R.string.d779668d_801e_4818_bffa_88aafa0e2e04,
R.string.a5e27cad3_1b88_44f6_ae7e_3df72d771b31,
R.string.a48b025d0_3a0c_482a_88c1_f7644e5a77ae,
R.string.a906b952f_6748_4b60_bf06_845ddd05627f,
R.string.a417cf090_26fb_4607_8b57_9da3e4f46866,
R.string.e30b782e_860c_449b_a2f4_d6370385784c,
R.string.a7eae2620_82cc_4491_abde_cd9036ef575c,
R.string.a6b7ef03d_007e_443d_9adc_95e2777510c8,
R.string.a707db3da_afa9_4987_aa03_3e56c54d5d70,
R.string.a89d314ea_9bbf_49c9_8ef8_45c1940fc14e,
R.string.d44acd05_d6cf_4f20_82f9_1c305501eaea,
R.string.de980bad_7277_4dc4_87bd_282dedf83bc9,
R.string.b6f1e0ee_e014_4d14_b3cf_bc93b38a6fb8,
R.string.a399bf137_1dfd_455e_a157_113455496824,
R.string.a8d27f3a5_0ec8_4594_8037_f9df98b3ed22,
R.string.a9bb68287_823d_456c_9899_f06471d7acd8,
R.string.a328a7c9f_b8b3_46b4_a702_0953719dbf41,
R.string.f33ce768_92a3_4455_926f_4b9533645035,
R.string.a7a4e8bbd_1466_41ea_a01b_7b85bb85f193,
R.string.a1d2da91_3186_4707_a82a_54304896b119,
R.string.d8e97199_df38_4d84_8e7b_0f4cf0d9463f,
R.string.a0f24ed03_1a67_4cfd_a7e5_9451744cca72,
R.string.fc06fbad_700c_493a_8034_800fbcb50c81,
R.string.a0a44e04_494b_460a_9270_c4e3aee35abc,
R.string.a98034c0f_c0ea_4d1c_a377_3c506c69dabb,
R.string.ea7b7d74_f09f_429d_ba08_65d2952613ee,
R.string.e168c74e_66ad_4bfc_810e_fa87a7a40b0c,
R.string.a805f8c5a_6262_4795_aaae_52a9ec7e615c,
R.string.ef05cef8_ebad_474a_a02a_d49315de6792,
R.string.c1fb1ae6_6e34_4ca6_9a5c_e27de0516fad,
R.string.a91e5828_5760_4cd7_aa32_4b50daa9378f,
R.string.a808f0035_7b2e_497e_9499_bfaced1aa870,
R.string.a2ea131e9_079c_43b0_97aa_70e199abff7a,
R.string.a1d92f503_6203_4077_a295_4bd635b255f0,
R.string.e8270748_f60b_4999_9a5e_82587ce50c6a,
R.string.a62d8c536_3f29_4ca8_adef_fbd896537a91,
R.string.a6a3a954d_1a2c_4725_858d_cd36b1a0290f,
R.string.a0747c233_660a_4b37_91bc_4641a9cf1279,
R.string.a6117d393_721a_4445_90a3_700a2586926c,
R.string.a72ad2a1_359d_4408_8037_ecca329d2588,
R.string.a7cca980c_e0db_4d62_ad89_f835abb3ab4d,
R.string.a30251bf6_3b70_4114_abed_f775212cffa9,
R.string.a75a4599c_4156_4fa6_b6ff_44d2e662e261,
R.string.df64f627_aecf_4081_bac8_9b750a8c66a7,
R.string.ad4d34a2_ba68_495c_84dd_f7c2f6b9d2f5,
R.string.e379d69b_ee85_4d59_97e2_dec58d183d49,
R.string.a21aaa91e_ad15_4be3_a7ed_5690a589bd8e,
R.string.a14f1f692_2dcb_4518_93e4_970ce5462fa8,
R.string.a08ebc354_6cf5_4480_9024_c7e292733fd7,
R.string.a4484ea83_e719_4cbf_8e45_d6ea2c4f17cb,
R.string.a285ba426_046e_497a_a604_979fe39d0763,
R.string.a39e74ec9_3704_4095_befa_c75c996eaff6,
R.string.a2a805b4e_7e6b_43d9_b067_1932cccbe883,
R.string.a1c4f13c5_ce14_4440_a427_751b86ffd272,
R.string.a534c2cba_40cf_48f4_bc07_272f3b6c5f4d,
R.string.f3aeff31_0b29_41b4_8409_9d19f6babc5e,
R.string.a587c4f5e_7d41_4444_a226_4c2c3d86defc,
R.string.a5e8f20fe_0fb1_41dd_b317_2fa922386931,
R.string.a033b2f3d_679a_4021_ae4f_f93b8a387d34,
R.string.d63653b5_a8b3_455c_b3ab_aad4c8593740,
R.string.a1568b401_9177_4ec5_8588_035d6a06898d,
R.string.e016631c_1690_42d6_b71a_529ad5af34ac,
R.string.a9af9d74_d183_4460_9e53_3287039e275b,
R.string.cbca1789_5af9_45a4_83be_7c139a308911,
R.string.a2ce3510c_36da_4b28_aef3_90b829824c49,
R.string.a8471f783_cbcb_4282_9274_4d9990b1e842,
R.string.b2248eb4_649c_4592_9736_a1244a02254b,
R.string.a990bbec6_7335_42b6_8ced_3dbfefbf1b39,
R.string.a74900d74_8e18_4d17_8064_8fffaa13bff1,
R.string.a10088567_1cbc_496c_8e84_bd4d514f08e1,
R.string.e69ad882_cd85_4080_975b_2f5cf21bfa26,
R.string.a5b18a1bf_4070_4e4a_8a1f_851533d6982b,
R.string.a8431c2fb_ee66_4fd5_b528_e967119cd005,
R.string.e4f9733d_7d8e_4dfa_b7c5_b5d7b741a73e,
R.string.a486578e1_5dbc_497b_aefb_3490fcce3c43,
R.string.d9a2bb30_34cd_4ac9_a9c5_6ce4dbb21984,
R.string.c03387c2_817b_4700_86ee_94c3b9d85da7,
R.string.ac8c2192_ae36_450e_b19a_fd7564dd91f7,
R.string.a57af3427_81a8_4894_b056_25991bcd69dd,
R.string.a2078d10b_6e01_4fc0_8704_a690ff08b187,
R.string.e32bc9db_a7e1_4c82_afa9_2a05d52d979a,
R.string.a4bcea0e_bcdc_44fd_95f9_5cc2dfdefe24,
R.string.a771f717f_5255_45c4_8356_816cb254034b,
R.string.df7d5715_5c01_4b8e_89c7_c59341dc7ef9,
R.string.aecf18dc_bfbb_47fe_8f24_13614da07cb9,
R.string.bb8450c7_5582_45cf_85a7_a5623fa053ca,
R.string.a34107916_ba6c_4598_904a_d0b7e8d79fd3,
R.string.a9abdbeaa_e817_41b6_88f4_8671e50dec0a,
R.string.a90db8ee8_0d42_431c_ad33_6d787458a4aa,
R.string.a7a4bb06d_6d8a_4833_9d02_5679bf056b55,
R.string.a51341818_c593_42c0_ab02_0e7d0f6bbf9f,
R.string.a082b9904_aad1_430b_80ca_a75df517ef7b,
R.string.fb47fc0a_3497_4721_ab37_3621a72d7ee4,
R.string.a22145d27_b0e9_4cad_94c0_81b253075f64,
R.string.a9f09b0fc_c583_4d28_b283_f791f0d74714,
R.string.dbf1d159_d56b_4425_9938_39c3d9dcd0ea,
R.string.e3ce0086_0349_4c4a_9ceb_e97d53a07da3,
R.string.d463af3c_80ed_44dc_8492_92b2a7a32065,
R.string.ad813340_869a_4184_bac8_75dca31d1992,
R.string.a5ad28604_9d21_4c09_b675_84df241ea439,
R.string.bcaf2e73_4fa2_495a_b324_521b9d8bcc9c,
R.string.a133c3d47_92c2_4ba9_b464_fe42bd29e34b,
R.string.f20f7174_13ce_4cce_9abb_9a179c85fa8d,
R.string.a58387b03_4329_42e9_abc3_606fddc5675b,
R.string.c2423e3d_f788_4110_bfe5_4c716f4fc2ea,
R.string.a5cdac156_04a2_48f3_9c39_6aa5e64dc4b5,
R.string.a1dadb908_123a_4f09_9dc5_64966927129d,
R.string.a0d365e3_4748_42cf_9b99_435a20bab246,
R.string.a345453dc_abb2_4369_aaab_a7acdaf5a907,
R.string.a8ae79220_2f96_4533_94b7_4f5c708f6946,
R.string.a57e08e50_1d15_4931_932d_04f22aa43a16,
R.string.a6412f21b_1d85_4cbc_92f4_0c6929ea0583,
R.string.c52f2800_4106_47aa_a27c_530159255ccd,
R.string.a91bc3218_4a08_4dbb_975d_f076067cfd43,
R.string.a6b832a49_7842_468c_9de2_39b0f2545d4a,

        ).shuffled().first()

        Log.w("SOmeTAG", id.toString())

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}
